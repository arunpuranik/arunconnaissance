package com.connaissance.domain;

/**
 * BankDetailsTable entity. @author MyEclipse Persistence Tools
 */

public class BankDetailsTable implements java.io.Serializable {

	// Fields

	private Long bankId;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private String bankDeatails;
	private String nameInTheBank;
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	private String personName;

	// Constructors

	/** default constructor */
	public BankDetailsTable() {
	}

	/** full constructor */
	public BankDetailsTable(
			ConsultantRegisrationTable consultantRegisrationTable,
			String bankDeatails, String nameInTheBank, String bankName,
			String accountNumber, String ifscCode, String personName) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		this.bankDeatails = bankDeatails;
		this.nameInTheBank = nameInTheBank;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.personName = personName;
	}

	// Property accessors

	public Long getBankId() {
		return this.bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return this.consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public String getBankDeatails() {
		return this.bankDeatails;
	}

	public void setBankDeatails(String bankDeatails) {
		this.bankDeatails = bankDeatails;
	}

	public String getNameInTheBank() {
		return this.nameInTheBank;
	}

	public void setNameInTheBank(String nameInTheBank) {
		this.nameInTheBank = nameInTheBank;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return this.ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}