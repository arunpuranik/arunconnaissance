package com.connaissance.mbean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class LeadGenerationCategoryMBean {

	private ConnIDelegate connIDelegate;
	private LeadGenerationCategoryTable leadGenerationCategoryTable;
	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private Long superAdminMId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");

		this.connIDelegate = connIDelegate;
	}

	public LeadGenerationCategoryTable getLeadGenerationCategoryTable() {
		return leadGenerationCategoryTable;
	}

	public void setLeadGenerationCategoryTable(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		this.leadGenerationCategoryTable = leadGenerationCategoryTable;
	}

	public String saveLeadGenerationCategory() {

		boolean isSaved = false;
		try {

			superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");
			httpSession.setAttribute("LEADGENERATION",
					leadGenerationCategoryTable.getCategoryId());
			leadGenerationCategoryTable.getCnnAdminMRegistrationDetails()
					.setSuperAdminMId(superAdminMId);

			isSaved = connIDelegate
					.saveLeadGenerationCategory(leadGenerationCategoryTable);

			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Thank you", "");
			FacesContext.getCurrentInstance().addMessage(null, message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public CnnAdminMRegistrationDetails getCnnAdminMRegistrationDetails() {
		return cnnAdminMRegistrationDetails;
	}

	public void setCnnAdminMRegistrationDetails(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		superAdminMId = (Long) httpSession.getAttribute("CNNADMINDETAILS");
		cnnAdminMRegistrationDetails = (CnnAdminMRegistrationDetails) httpSession
				.getAttribute("CNNADMINDETAILS");
		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;
	}

	public Long getSuperAdminMId() {
		return superAdminMId;
	}

	public void setSuperAdminMId(Long superAdminMId) {
		this.superAdminMId = superAdminMId;
	}

}
