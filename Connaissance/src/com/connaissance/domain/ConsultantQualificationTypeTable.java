package com.connaissance.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ConsultantQualificationTypeTable entity. @author MyEclipse Persistence Tools
 */

public class ConsultantQualificationTypeTable implements java.io.Serializable {

	// Fields

	private Long qualificationTypeId;
	private String qualificationType;
	private Set consultantQualificationDeatilses = new HashSet(0);

	// Constructors

	/** default constructor */
	public ConsultantQualificationTypeTable() {
	}

	/** full constructor */
	public ConsultantQualificationTypeTable(String qualificationType,
			Set consultantQualificationDeatilses) {
		this.qualificationType = qualificationType;
		this.consultantQualificationDeatilses = consultantQualificationDeatilses;
	}

	// Property accessors

	public Long getQualificationTypeId() {
		return this.qualificationTypeId;
	}

	public void setQualificationTypeId(Long qualificationTypeId) {
		this.qualificationTypeId = qualificationTypeId;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}

	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

	public Set getConsultantQualificationDeatilses() {
		return this.consultantQualificationDeatilses;
	}

	public void setConsultantQualificationDeatilses(
			Set consultantQualificationDeatilses) {
		this.consultantQualificationDeatilses = consultantQualificationDeatilses;
	}

}