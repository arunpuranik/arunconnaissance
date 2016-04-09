package com.connaissance.domain;

/**
 * AllCommonRegistrationPage entity. @author MyEclipse Persistence Tools
 */

public class AllCommonRegistrationPage implements java.io.Serializable {

	// Fields

	private Long allCommonId;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String alternateNumber;
	private String emailId;
	private String password;
	private String address;
	private String userIdenfn;

	// Constructors

	/** default constructor */
	public AllCommonRegistrationPage() {
	}

	/** full constructor */
	public AllCommonRegistrationPage(String firstName, String lastName,
			String userIdenfn, String mobileNumber, String alternateNumber,
			String emailId, String password, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.alternateNumber = alternateNumber;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.userIdenfn = userIdenfn;
	}

	// Property accessors

	public Long getAllCommonId() {
		return this.allCommonId;
	}

	public void setAllCommonId(Long allCommonId) {
		this.allCommonId = allCommonId;
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

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateNumber() {
		return this.alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserIdenfn() {
		return userIdenfn;
	}

	public void setUserIdenfn(String userIdenfn) {
		this.userIdenfn = userIdenfn;
	}

}