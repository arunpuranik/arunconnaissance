package com.connaissance.mbean;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantExperienceDeatilsTable;
import com.connaissance.domain.ConsultantQualificationDeatils;
import com.connaissance.domain.ConsultantQualificationTypeTable;

public class ConsultantExperienceDeatilsMean {

	private ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable;
	private ConnIDelegate connIDelegate;

	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public String saveEducationDeatils() {

		boolean isSaved = false;

		try {

			isSaved = connIDelegate
					.SaveExperienceDeatils(consultantExperienceDeatilsTable);

			System.out.println("Consultant Special Subject "
					+ consultantExperienceDeatilsTable.getDesignation());

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./consultanthome.faces");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}

	public ConsultantExperienceDeatilsTable getConsultantExperienceDeatilsTable() {
		return consultantExperienceDeatilsTable;
	}

	public void setConsultantExperienceDeatilsTable(
			ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable) {
		this.consultantExperienceDeatilsTable = consultantExperienceDeatilsTable;
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {

		this.connIDelegate = connIDelegate;
	}

}
