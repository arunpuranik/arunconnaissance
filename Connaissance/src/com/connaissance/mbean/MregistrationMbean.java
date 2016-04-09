package com.connaissance.mbean;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;

public class MregistrationMbean {

	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private ConnIDelegate connIDelegate;
	private String rPassword;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public String regAdmin() {
		boolean isSaved = false;
		try {

			httpSession.setAttribute("SUPERADMINMID",
					cnnAdminMRegistrationDetails.getSuperAdminMId());
			httpSession.setAttribute("CONNAADMINDETAILS",
					cnnAdminMRegistrationDetails);
			if (cnnAdminMRegistrationDetails.getSuperAdminMPassword().equals(
					rPassword)) {
				Date date = new Date();
				cnnAdminMRegistrationDetails.setSuperAdminMLastLoginTime(date);
				isSaved = connIDelegate.regAdmin(cnnAdminMRegistrationDetails);
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("../connaissance/login.faces");

			} else {
				FacesMessage message = new FacesMessage(
						FacesMessage.SEVERITY_INFO, "Thank You Registring", "");
				FacesContext.getCurrentInstance().addMessage(null, message);

			}

		} catch (Exception e) {
		}

		return null;

	}

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

	public String getrPassword() {
		return rPassword;
	}

	public void setrPassword(String rPassword) {
		this.rPassword = rPassword;
	}

}
