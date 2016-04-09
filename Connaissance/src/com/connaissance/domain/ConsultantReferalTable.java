package com.connaissance.domain;

/**
 * ConsultantReferalTable entity. @author MyEclipse Persistence Tools
 */

public class ConsultantReferalTable implements java.io.Serializable {

	// Fields

	private Long consultantReferalId;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private String candidateName;
	private String emailId;
	private String contactNumber;
	private String filePath;
	private String resumeTitle;
	private String docFile;

	// Constructors

	/** default constructor */
	public ConsultantReferalTable() {
	}

	/** full constructor */
	public ConsultantReferalTable(
			ConsultantRegisrationTable consultantRegisrationTable,
			String candidateName, String emailId, String contactNumber,
			String filePath, String resumeTitle, String docFile) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		this.candidateName = candidateName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.filePath = filePath;
		this.resumeTitle = resumeTitle;
		this.docFile = docFile;
	}

	// Property accessors

	public Long getConsultantReferalId() {
		return this.consultantReferalId;
	}

	public void setConsultantReferalId(Long consultantReferalId) {
		this.consultantReferalId = consultantReferalId;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return this.consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public String getCandidateName() {
		return this.candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
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

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getResumeTitle() {
		return this.resumeTitle;
	}

	public void setResumeTitle(String resumeTitle) {
		this.resumeTitle = resumeTitle;
	}

	public String getDocFile() {
		return this.docFile;
	}

	public void setDocFile(String docFile) {
		this.docFile = docFile;
	}

}