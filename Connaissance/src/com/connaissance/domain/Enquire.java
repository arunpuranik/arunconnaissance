package com.connaissance.domain;

/**
 * Enquire entity. @author MyEclipse Persistence Tools
 */

public class Enquire implements java.io.Serializable {

	// Fields

	private Long enquireId;
	private String name;
	private String emailId;
	private String phoneNumber;
	private String yourQuery;

	// Constructors

	/** default constructor */
	public Enquire() {
	}

	/** full constructor */
	public Enquire(String name, String emailId, String phoneNumber,
			String yourQuery) {
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.yourQuery = yourQuery;
	}

	// Property accessors

	public Long getEnquireId() {
		return this.enquireId;
	}

	public void setEnquireId(Long enquireId) {
		this.enquireId = enquireId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getYourQuery() {
		return this.yourQuery;
	}

	public void setYourQuery(String yourQuery) {
		this.yourQuery = yourQuery;
	}

}