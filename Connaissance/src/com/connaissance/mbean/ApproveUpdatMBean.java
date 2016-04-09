package com.connaissance.mbean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantRegisrationTable;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class ApproveUpdatMBean {

	private ConnIDelegate connIDelegate;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private LeadGenerationCategoryTable leadGenerationCategoryTable;
	private Long consultantId;
	private boolean formRendered;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		httpSession.getAttribute("CONNAISSANCEDETAILS");
		consultantId = (Long) httpSession.getAttribute("consultantId");
		this.consultantRegisrationTable = connIDelegate
				.getApprovedEditValues(consultantId);
	}

	public LeadGenerationCategoryTable getLeadGenerationCategoryTable() {
		return leadGenerationCategoryTable;
	}

	public void setLeadGenerationCategoryTable(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		this.leadGenerationCategoryTable = leadGenerationCategoryTable;
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

	public String editApproveMethod() {
		httpSession.getAttribute("consultantId");
		
		boolean isSaved = false;
		try {
			String mj="@connaissance.co";
			consultantRegisrationTable.setOfficialMailid(consultantRegisrationTable.getOfficialMailid()+mj);
			System.out.println("Official MailId"+consultantRegisrationTable.getOfficialMailid());
			isSaved = connIDelegate.editApproveMethod(consultantRegisrationTable);
			if (isSaved) {
				System.out.println("Edit Method ;;;;;;;");
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("./ApprovingPartner.faces");
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Edit value is Successfully updated ........", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				setFormRendered(true);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isFormRendered() {
		return formRendered;
	}

	public void setFormRendered(boolean formRendered) {
		this.formRendered = formRendered;
	}

}
