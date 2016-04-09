package com.connaissance.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * LeadGenerationCategoryTable entity. @author MyEclipse Persistence Tools
 */

public class LeadGenerationCategoryTable implements java.io.Serializable {

	// Fields

	private Long categoryId;
	private CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails;
	private String leadGenerationCategoryType;
	private String partnerOfConnaissance;
	private String doesItHaveSubCategory;
	private String subCategoryType;
	private String categoryCode;
	private String subcategoryCode;
	private Set consultantRegisrationTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public LeadGenerationCategoryTable() {
	}

	/** full constructor */
	public LeadGenerationCategoryTable(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails,
			String leadGenerationCategoryType, String partnerOfConnaissance,
			String doesItHaveSubCategory, String subCategoryType,
			String categoryCode, String subcategoryCode,
			Set consultantRegisrationTables) {
		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;
		this.leadGenerationCategoryType = leadGenerationCategoryType;
		this.partnerOfConnaissance = partnerOfConnaissance;
		this.doesItHaveSubCategory = doesItHaveSubCategory;
		this.subCategoryType = subCategoryType;
		this.categoryCode = categoryCode;
		this.subcategoryCode = subcategoryCode;
		this.consultantRegisrationTables = consultantRegisrationTables;
	}

	// Property accessors

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public CnnAdminMRegistrationDetails getCnnAdminMRegistrationDetails() {
		return this.cnnAdminMRegistrationDetails;
	}

	public void setCnnAdminMRegistrationDetails(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		this.cnnAdminMRegistrationDetails = cnnAdminMRegistrationDetails;
	}

	public String getLeadGenerationCategoryType() {
		return this.leadGenerationCategoryType;
	}

	public void setLeadGenerationCategoryType(String leadGenerationCategoryType) {
		this.leadGenerationCategoryType = leadGenerationCategoryType;
	}

	public String getPartnerOfConnaissance() {
		return this.partnerOfConnaissance;
	}

	public void setPartnerOfConnaissance(String partnerOfConnaissance) {
		this.partnerOfConnaissance = partnerOfConnaissance;
	}

	public String getDoesItHaveSubCategory() {
		return this.doesItHaveSubCategory;
	}

	public void setDoesItHaveSubCategory(String doesItHaveSubCategory) {
		this.doesItHaveSubCategory = doesItHaveSubCategory;
	}

	public String getSubCategoryType() {
		return this.subCategoryType;
	}

	public void setSubCategoryType(String subCategoryType) {
		this.subCategoryType = subCategoryType;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getSubcategoryCode() {
		return this.subcategoryCode;
	}

	public void setSubcategoryCode(String subcategoryCode) {
		this.subcategoryCode = subcategoryCode;
	}

	public Set getConsultantRegisrationTables() {
		return this.consultantRegisrationTables;
	}

	public void setConsultantRegisrationTables(Set consultantRegisrationTables) {
		this.consultantRegisrationTables = consultantRegisrationTables;
	}

}