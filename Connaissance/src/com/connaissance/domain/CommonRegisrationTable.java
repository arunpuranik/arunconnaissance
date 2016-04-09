package com.connaissance.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * CommonRegisrationTable entity. @author MyEclipse Persistence Tools
 */

public class CommonRegisrationTable implements java.io.Serializable {

	// Fields

	private Long commonRegId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String userIdenfn;
	private String address;
	private String contactNum;
	private String walkinId;
	private String enquire;
	private Set moreInformationTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public CommonRegisrationTable() {
	}

	/** full constructor */
	public CommonRegisrationTable(String firstName, String lastName,String enquire,
			String emailId, String password, String userIdenfn, String address,
			String contactNum, String walkinId, Set moreInformationTables) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.userIdenfn = userIdenfn;
		this.address = address;
		this.contactNum = contactNum;
		this.walkinId = walkinId;
		this.moreInformationTables = moreInformationTables;
		this.enquire=enquire;
	}

	// Property accessors

	public Long getCommonRegId() {
		return this.commonRegId;
	}

	public void setCommonRegId(Long commonRegId) {
		this.commonRegId = commonRegId;
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

	public String getUserIdenfn() {
		return this.userIdenfn;
	}

	public void setUserIdenfn(String userIdenfn) {
		this.userIdenfn = userIdenfn;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNum() {
		return this.contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getWalkinId() {
		return this.walkinId;
	}

	public void setWalkinId(String walkinId) {
		this.walkinId = walkinId;
	}

	public Set getMoreInformationTables() {
		return this.moreInformationTables;
	}

	public void setMoreInformationTables(Set moreInformationTables) {
		this.moreInformationTables = moreInformationTables;
	}

	public String getEnquire() {
		return enquire;
	}

	public void setEnquire(String enquire) {
		this.enquire = enquire;
	}

}