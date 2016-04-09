package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;

public class ConnassianceAdminHeaderMbean {

	private ConnIDelegate connIDelegate;
	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		cnnAdminMRegistrationDetails = (CnnAdminMRegistrationDetails) httpSession
				.getAttribute("CONNAADMINDETAILS");
		System.out.println("admin name:::??"
				+ cnnAdminMRegistrationDetails.getSuperAdminMName());
		this.connIDelegate = connIDelegate;
	}

	public CnnAdminMRegistrationDetails getCnnAdminMRegistrationDetails() {
		return cnnAdminMRegistrationDetails;
	}

	public void setCnnAdminMRegistrationDetails(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		cnnAdminMRegistrationDetails = (CnnAdminMRegistrationDetails) httpSession
				.getAttribute("CONNAADMINDETAILS");
		System.out.println("admin name:::??"
				+ cnnAdminMRegistrationDetails.getSuperAdminMName());

		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;
	}

}
