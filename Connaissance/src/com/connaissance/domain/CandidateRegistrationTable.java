package com.connaissance.domain;

/**
 * CandidateRegistrationTable entity. @author MyEclipse Persistence Tools
 */

public class CandidateRegistrationTable implements java.io.Serializable {

	// Fields

	private Long userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String contactNumber;
	private String usrIdntfcn;

	// Constructors

	/** default constructor */
	public CandidateRegistrationTable() {
	}

	/** full constructor */
	public CandidateRegistrationTable(String firstName, String lastName,
			String emailId, String password, String contactNumber,
			String usrIdntfcn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.usrIdntfcn = usrIdntfcn;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUsrIdntfcn() {
		return this.usrIdntfcn;
	}

	public void setUsrIdntfcn(String usrIdntfcn) {
		this.usrIdntfcn = usrIdntfcn;
	}

}