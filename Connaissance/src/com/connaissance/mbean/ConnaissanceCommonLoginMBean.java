package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantRegisrationTable;

public class ConnaissanceCommonLoginMBean {

	private ConsultantRegisrationTable consultantRegisrationTable;
	private ConnIDelegate connIDelegate;

	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public String saveLoginMethod() {

		try {

			ConsultantRegisrationTable consultantRegisrationTable = connIDelegate
					.saveLoginMethod(this.consultantRegisrationTable);

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("../connaissanceStartingPage.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

}
