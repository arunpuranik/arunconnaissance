package com.connaissance.domain;

/**
 * CandidateEnquireIdTable entity. @author MyEclipse Persistence Tools
 */

public class CandidateEnquireIdTable implements java.io.Serializable {

	// Fields

	private Long enqireId;
	private String enquireTypeId;

	// Constructors

	/** default constructor */
	public CandidateEnquireIdTable() {
	}

	/** full constructor */
	public CandidateEnquireIdTable(String enquireTypeId) {
		this.enquireTypeId = enquireTypeId;
	}

	// Property accessors

	public Long getEnqireId() {
		return this.enqireId;
	}

	public void setEnqireId(Long enqireId) {
		this.enqireId = enqireId;
	}

	public String getEnquireTypeId() {
		return this.enquireTypeId;
	}

	public void setEnquireTypeId(String enquireTypeId) {
		this.enquireTypeId = enquireTypeId;
	}

}