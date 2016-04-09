package com.connaissance.domain;

/**
 * ReferedCandidateDatailsTable entity. @author MyEclipse Persistence Tools
 */

public class ReferedCandidateDatailsTable implements java.io.Serializable {

	// Fields

	private Long referedId;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private String firstName;
	private String lastName;
	private String emailId;
	private String contactNumber;

	// Constructors

	/** default constructor */
	public ReferedCandidateDatailsTable() {
	}

	/** full constructor */
	public ReferedCandidateDatailsTable(
			ConsultantRegisrationTable consultantRegisrationTable,
			String firstName, String lastName, String emailId,
			String contactNumber) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}

	// Property accessors

	public Long getReferedId() {
		return this.referedId;
	}

	public void setReferedId(Long referedId) {
		this.referedId = referedId;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return this.consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}