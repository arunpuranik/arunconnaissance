package com.connaissance.mbean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CnnAdminMRegistrationDetails;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class TestEditMBean {

	private ConnIDelegate connIDelegate;
	private Long categoryId;
	private Long superAdminMId;
	private LeadGenerationCategoryTable leadGenerationCategoryTable;
	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private List<LeadGenerationCategoryTable> generationCategoryTablesList;
	private List<LeadGenerationCategoryTable> generationCategoryTablesList1 = new ArrayList<LeadGenerationCategoryTable>();
	private boolean delrendered;
	private Long deleteId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;

		initialse();
	}

	private void initialse() {
		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();

		Long superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");
		generationCategoryTablesList = connIDelegate
				.getSulekhaLeads(superAdminMId);
	}

	public String getSulekhaLeads() {
		Map<String, String> map = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		Long superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");
		System.out.println("some thing::"
				+ cnnAdminMRegistrationDetails.getSuperAdminMId());
		categoryId = Long.parseLong(map.get("categoryId"));
		httpSession.setAttribute("categoryId", categoryId);
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./EditMe.faces");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public String getSulekhaLeads1() {
		Map<String, String> map = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		Long superAdminMId = (Long) httpSession.getAttribute("SUPERADMINMID");
		System.out.println("some thing::"
				+ cnnAdminMRegistrationDetails.getSuperAdminMId());
		categoryId = Long.parseLong(map.get("categoryId"));
		httpSession.setAttribute("categoryId", categoryId);
		delrendered = true;
		return null;

	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSuperAdminMId() {
		return superAdminMId;
	}

	public void setSuperAdminMId(Long superAdminMId) {
		this.superAdminMId = superAdminMId;
	}

	public LeadGenerationCategoryTable getLeadGenerationCategoryTable() {
		return leadGenerationCategoryTable;
	}

	public void setLeadGenerationCategoryTable(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		if (httpSession.getAttribute("DELETE") != null) {
			deleteId = (Long) httpSession.getAttribute("DELETE");

		} else {
			this.leadGenerationCategoryTable = leadGenerationCategoryTable;
		}

	}

	public CnnAdminMRegistrationDetails getCnnAdminMRegistrationDetails() {
		return cnnAdminMRegistrationDetails;
	}

	public void setCnnAdminMRegistrationDetails(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;

	}

	public List<LeadGenerationCategoryTable> getGenerationCategoryTablesList() {
		return generationCategoryTablesList;
	}

	public void setGenerationCategoryTablesList(
			List<LeadGenerationCategoryTable> generationCategoryTablesList) {
		this.generationCategoryTablesList = generationCategoryTablesList;
	}

	public List<LeadGenerationCategoryTable> getGenerationCategoryTablesList1() {
		return generationCategoryTablesList1;
	}

	public void setGenerationCategoryTablesList1(
			List<LeadGenerationCategoryTable> generationCategoryTablesList1) {
		this.generationCategoryTablesList1 = generationCategoryTablesList1;
	}

	public boolean isDelrendered() {
		return delrendered;
	}

	public void setDelrendered(boolean delrendered) {
		this.delrendered = delrendered;
	}

	public Long getDeleteId() {
		return deleteId;
	}

	public void setDeleteId(Long deleteId) {
		this.deleteId = deleteId;
	}

}
