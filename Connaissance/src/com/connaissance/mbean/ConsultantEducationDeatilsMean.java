package com.connaissance.mbean;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantQualificationDeatils;
import com.connaissance.domain.ConsultantQualificationTypeTable;

public class ConsultantEducationDeatilsMean {

	private ConsultantQualificationDeatils consultantQualificationDeatils;
	private ConnIDelegate connIDelegate;
	private List<ConsultantQualificationTypeTable> consultantQualificationTypeTableList;

	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public String saveEducationDeatils() {

		boolean isSaved = false;

		try {

			isSaved = connIDelegate
					.SaveEducationDeatils(consultantQualificationDeatils);

			System.out.println("Consultant Special Subject "
					+ consultantQualificationDeatils.getSpecialSubject());

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissanceCommonLoginPage.faces");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;

	}

	public ConsultantQualificationDeatils getConsultantQualificationDeatils() {
		return consultantQualificationDeatils;
	}

	public void setConsultantQualificationDeatils(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		consultantQualificationTypeTableList = connIDelegate
				.getQualificationlist();
		this.consultantQualificationDeatils = consultantQualificationDeatils;

	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {

		this.connIDelegate = connIDelegate;
	}

	public List<ConsultantQualificationTypeTable> getConsultantQualificationTypeTableList() {
		return consultantQualificationTypeTableList;
	}

	public void setConsultantQualificationTypeTableList(
			List<ConsultantQualificationTypeTable> consultantQualificationTypeTableList) {
		this.consultantQualificationTypeTableList = consultantQualificationTypeTableList;
	}

}
