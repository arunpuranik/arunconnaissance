package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;

public class SuperMethodsMBean {

	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private ConnIDelegate connIDelegate;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public CnnAdminMRegistrationDetails getCnnAdminMRegistrationDetails() {
		return cnnAdminMRegistrationDetails;
	}

	public void setCnnAdminMRegistrationDetails(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

	public String commonCommandLink() {
		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./consultantRegisrationPage.faces");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

	public String commonCommandLink1() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./leadgenerationcategory.faces");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}

}
