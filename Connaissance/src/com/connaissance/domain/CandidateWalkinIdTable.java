package com.connaissance.domain;

/**
 * CandidateWalkinIdTable entity. @author MyEclipse Persistence Tools
 */

public class CandidateWalkinIdTable implements java.io.Serializable {

	// Fields

	private Long walkinId;
	private String walkinTypeId;
	private String candidateName;
	private String candidateEmailId;
	private String contactNumber;

	// Constructors

	/** default constructor */
	public CandidateWalkinIdTable() {
	}

	/** full constructor */
	public CandidateWalkinIdTable(String walkinTypeId, String candidateName,
			String candidateEmailId, String contactNumber) {
		this.walkinTypeId = walkinTypeId;
		this.candidateName = candidateName;
		this.candidateEmailId = candidateEmailId;
		this.contactNumber = contactNumber;
	}

	// Property accessors

	public Long getWalkinId() {
		return this.walkinId;
	}

	public void setWalkinId(Long walkinId) {
		this.walkinId = walkinId;
	}

	public String getWalkinTypeId() {
		return this.walkinTypeId;
	}

	public void setWalkinTypeId(String walkinTypeId) {
		this.walkinTypeId = walkinTypeId;
	}

	public String getCandidateName() {
		return this.candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateEmailId() {
		return this.candidateEmailId;
	}

	public void setCandidateEmailId(String candidateEmailId) {
		this.candidateEmailId = candidateEmailId;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}