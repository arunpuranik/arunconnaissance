package com.connaissance.mbean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantRegisrationTable;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class ApprovingAuthorityMBean {
	private ConnIDelegate connIDelegate;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private List<LeadGenerationCategoryTable> leadGenerationCategoryTablesList;
	private List<ConsultantRegisrationTable> consultantRegisrationTablesList;
	private Long consultantId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
		leadGenerationCategoryTablesList = connIDelegate
				.getleadGenerationCategoryTablesList();
		consultantRegisrationTablesList = connIDelegate
				.getConsultantRegisrationTablesList();
	}

	public String getApprovingLeads() {
		Map<String, String> map = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		Long superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");
		consultantId = Long.parseLong(map.get("consultantId"));
		httpSession.setAttribute("consultantId", consultantId);
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./ApproveMe.faces");
		} catch (IOException e) {
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

	public List<LeadGenerationCategoryTable> getLeadGenerationCategoryTablesList() {
		return leadGenerationCategoryTablesList;
	}

	public void setLeadGenerationCategoryTablesList(
			List<LeadGenerationCategoryTable> leadGenerationCategoryTablesList) {
		this.leadGenerationCategoryTablesList = leadGenerationCategoryTablesList;
	}

	public String approve() {

		boolean isApproved = connIDelegate
				.checkApproval(consultantRegisrationTable);

		return null;
	}

	public List<ConsultantRegisrationTable> getConsultantRegisrationTablesList() {
		return consultantRegisrationTablesList;
	}

	public void setConsultantRegisrationTablesList(
			List<ConsultantRegisrationTable> consultantRegisrationTablesList) {
		this.consultantRegisrationTablesList = consultantRegisrationTablesList;
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

}