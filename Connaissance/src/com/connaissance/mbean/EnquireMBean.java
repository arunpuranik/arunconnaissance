package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.Enquire;

public class EnquireMBean {

	private Enquire enquire;
	private ConnIDelegate connIDelegate;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);
	public Enquire getEnquire() {
		return enquire;
	}
	public void setEnquire(Enquire enquire) {
		this.enquire = enquire;
	}
	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}
	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}
	
	public String saveEnquireDetails(){
		boolean isSaved=false;
		isSaved=connIDelegate.saveEnquireDetails(enquire);
		return null;
	}

}
