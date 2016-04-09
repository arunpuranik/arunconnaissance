package com.connaissance.domain;

/**
 * ReferCandidateTable entity. @author MyEclipse Persistence Tools
 */

public class ReferCandidateTable implements java.io.Serializable {

	// Fields

	private Long referCandidateId;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private String firstName;
	private String lastName;
	private String emailId;
	private String contactNumber;
	private String walkinId;

	// Constructors

	/** default constructor */
	public ReferCandidateTable() {
	}

	/** full constructor */
	public ReferCandidateTable(
			ConsultantRegisrationTable consultantRegisrationTable,
			String firstName, String lastName, String emailId,
			String contactNumber, String walkinId) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.walkinId = walkinId;
	}

	// Property accessors

	public Long getReferCandidateId() {
		return this.referCandidateId;
	}

	public void setReferCandidateId(Long referCandidateId) {
		this.referCandidateId = referCandidateId;
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

	public String getWalkinId() {
		return this.walkinId;
	}

	public void setWalkinId(String walkinId) {
		this.walkinId = walkinId;
	}

}