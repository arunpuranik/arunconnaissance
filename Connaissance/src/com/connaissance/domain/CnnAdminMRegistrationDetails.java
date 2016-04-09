package com.connaissance.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * CnnAdminMRegistrationDetails entity. @author MyEclipse Persistence Tools
 */

public class CnnAdminMRegistrationDetails implements java.io.Serializable {

	// Fields

	private Long superAdminMId;
	private String superAdminMEmailid;
	private String superAdminMPassword;
	private String superAdminMName;
	private Timestamp superAdminMLastLogoutTime;
	private String superAdminMPosition;
	private String superAdminMContact;
	private Timestamp superAdminMLastLoginTime;
	private String status;
	private Set leadGenerationCategoryTables = new HashSet(0);

	// Constructors

	/** default constructor */
	public CnnAdminMRegistrationDetails() {
	}

	/** full constructor */
	public CnnAdminMRegistrationDetails(String superAdminMEmailid,
			String superAdminMPassword, String superAdminMName,
			Timestamp superAdminMLastLogoutTime, String superAdminMPosition,
			String superAdminMContact, Timestamp superAdminMLastLoginTime,
			String status, Set leadGenerationCategoryTables) {
		this.superAdminMEmailid = superAdminMEmailid;
		this.superAdminMPassword = superAdminMPassword;
		this.superAdminMName = superAdminMName;
		this.superAdminMLastLogoutTime = superAdminMLastLogoutTime;
		this.superAdminMPosition = superAdminMPosition;
		this.superAdminMContact = superAdminMContact;
		this.superAdminMLastLoginTime = superAdminMLastLoginTime;
		this.status = status;
		this.leadGenerationCategoryTables = leadGenerationCategoryTables;
	}

	// Property accessors

	public Long getSuperAdminMId() {
		return this.superAdminMId;
	}

	public void setSuperAdminMId(Long superAdminMId) {
		this.superAdminMId = superAdminMId;
	}

	public String getSuperAdminMEmailid() {
		return this.superAdminMEmailid;
	}

	public void setSuperAdminMEmailid(String superAdminMEmailid) {
		this.superAdminMEmailid = superAdminMEmailid;
	}

	public String getSuperAdminMPassword() {
		return this.superAdminMPassword;
	}

	public void setSuperAdminMPassword(String superAdminMPassword) {
		this.superAdminMPassword = superAdminMPassword;
	}

	public String getSuperAdminMName() {
		return this.superAdminMName;
	}

	public void setSuperAdminMName(String superAdminMName) {
		this.superAdminMName = superAdminMName;
	}

	public Timestamp getSuperAdminMLastLogoutTime() {
		return this.superAdminMLastLogoutTime;
	}

	public void setSuperAdminMLastLogoutTime(Timestamp superAdminMLastLogoutTime) {
		this.superAdminMLastLogoutTime = superAdminMLastLogoutTime;
	}

	public String getSuperAdminMPosition() {
		return this.superAdminMPosition;
	}

	public void setSuperAdminMPosition(String superAdminMPosition) {
		this.superAdminMPosition = superAdminMPosition;
	}

	public String getSuperAdminMContact() {
		return this.superAdminMContact;
	}

	public void setSuperAdminMContact(String superAdminMContact) {
		this.superAdminMContact = superAdminMContact;
	}

	public Timestamp getSuperAdminMLastLoginTime() {
		return this.superAdminMLastLoginTime;
	}

	public void setSuperAdminMLastLoginTime(Timestamp superAdminMLastLoginTime) {
		this.superAdminMLastLoginTime = superAdminMLastLoginTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getLeadGenerationCategoryTables() {
		return this.leadGenerationCategoryTables;
	}

	public void setLeadGenerationCategoryTables(Set leadGenerationCategoryTables) {
		this.leadGenerationCategoryTables = leadGenerationCategoryTables;
	}

}