package com.connaissance.domain;

/**
 * ConsultantQualificationDeatils entity. @author MyEclipse Persistence Tools
 */

public class ConsultantQualificationDeatils implements java.io.Serializable {

	// Fields

	private Long qualificationId;
	private ConsultantQualificationTypeTable consultantQualificationTypeTable;
	private String organization;
	private String specialSubject;
	private Double percentage;

	// Constructors

	/** default constructor */
	public ConsultantQualificationDeatils() {
	}

	/** full constructor */
	public ConsultantQualificationDeatils(
			ConsultantQualificationTypeTable consultantQualificationTypeTable,
			String organization, String specialSubject, Double percentage) {
		this.consultantQualificationTypeTable = consultantQualificationTypeTable;
		this.organization = organization;
		this.specialSubject = specialSubject;
		this.percentage = percentage;
	}

	// Property accessors

	public Long getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
	}

	public ConsultantQualificationTypeTable getConsultantQualificationTypeTable() {
		return this.consultantQualificationTypeTable;
	}

	public void setConsultantQualificationTypeTable(
			ConsultantQualificationTypeTable consultantQualificationTypeTable) {
		this.consultantQualificationTypeTable = consultantQualificationTypeTable;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getSpecialSubject() {
		return this.specialSubject;
	}

	public void setSpecialSubject(String specialSubject) {
		this.specialSubject = specialSubject;
	}

	public Double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

}