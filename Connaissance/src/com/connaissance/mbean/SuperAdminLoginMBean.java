package com.connaissance.mbean;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;
import com.connaissance.domain.ConsultantRegisrationTable;

public class SuperAdminLoginMBean {

	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private ConnIDelegate connIDelegate;
	private String loginAs;
	private String emailId;
	private String password;
	private boolean actvateLinkRendered;
	private String randomString;
	private String checkSecurityNos;
	private String noMsg;
	private String type;

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

	public String commmonLogin() {

		String result = null;

		List list = null;
		if (loginAs.equalsIgnoreCase("Corporate")) {

			try {

				cnnAdminMRegistrationDetails.setSuperAdminMEmailid(emailId);
				cnnAdminMRegistrationDetails.setSuperAdminMPassword(password);
				CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails = connIDelegate
						.corporateLogin(this.cnnAdminMRegistrationDetails);

				if (randomString.equals(checkSecurityNos)) {

					if (cnnAdminMRegistrationDetails != null) {
						list = connIDelegate
								.validateCorporateStatus(this.cnnAdminMRegistrationDetails);
						if (list.size() != 0) {
							FacesContext.getCurrentInstance()
									.getExternalContext()
									.redirect("./home.faces");
						} else {
							actvateLinkRendered = true;
							FacesMessage message = new FacesMessage(
									FacesMessage.SEVERITY_WARN,
									"Please Activate your Account", "");
							FacesContext.getCurrentInstance().addMessage(null,
									message);
							result = "null";
						}
						httpSession.setAttribute("CONNAADMINDETAILS",
								cnnAdminMRegistrationDetails);
						httpSession
								.setAttribute("SUPERADMINMID",
										cnnAdminMRegistrationDetails
												.getSuperAdminMId());

					} else {
						FacesMessage message = new FacesMessage(
								FacesMessage.SEVERITY_WARN,
								"Invalid Login Details..!", "");
						FacesContext.getCurrentInstance().addMessage(null,
								message);
						result = "null";
					}
				} else {
					setNoMsg("captcha worng...Try again..!");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (loginAs.equalsIgnoreCase("Consultant")) {
			try {

				consultantRegisrationTable.setEmailId(emailId);
				consultantRegisrationTable.setPassword(password);
				ConsultantRegisrationTable consultantRegisrationTable = connIDelegate
						.consultantLogin(this.consultantRegisrationTable);

				if (randomString.equals(checkSecurityNos)) {

					if (consultantRegisrationTable != null) {
						list = connIDelegate
								.validateConsultantStatus(this.consultantRegisrationTable);
						if (list.size() != 0) {
							FacesContext.getCurrentInstance()
									.getExternalContext()
									.redirect("./consultanthome.faces");
						} else {
							FacesMessage message = new FacesMessage(
									FacesMessage.SEVERITY_WARN,
									"Please Activate your Account", "");
							FacesContext.getCurrentInstance().addMessage(null,
									message);
							result = "null";
						}
						httpSession.setAttribute("CONNAISSANCEDETAILS",
								consultantRegisrationTable);
						httpSession.setAttribute("CONSULTANTID",
								consultantRegisrationTable.getConsultantId());

					} else {
						FacesMessage message = new FacesMessage(
								FacesMessage.SEVERITY_WARN,
								"Invalid Login Details..!", "");
						FacesContext.getCurrentInstance().addMessage(null,
								message);
						result = "null";
					}
				} else {
					setNoMsg("captcha worng...Try again..!");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return null;
	}

	private List<Integer> intList = new ArrayList<Integer>();

	public void random() {
		for (int i = 1; i <= 4; i++) {
			intList.add(i + 5);
		}
		SecureRandom random = new SecureRandom();
		randomString = new BigInteger(8, random).toString(4);
	}

	public String getLoginAs() {
		return loginAs;
	}

	public void setLoginAs(String loginAs) {
		this.loginAs = loginAs;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActvateLinkRendered() {
		return actvateLinkRendered;
	}

	public void setActvateLinkRendered(boolean actvateLinkRendered) {
		this.actvateLinkRendered = actvateLinkRendered;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		random();
	}

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}

	public String getCheckSecurityNos() {
		return checkSecurityNos;
	}

	public void setCheckSecurityNos(String checkSecurityNos) {
		this.checkSecurityNos = checkSecurityNos;
	}

	public String getNoMsg() {
		return noMsg;
	}

	public void setNoMsg(String noMsg) {
		this.noMsg = noMsg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
