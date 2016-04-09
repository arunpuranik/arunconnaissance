package com.connaissance.domain;

/**
 * ConsultantExperienceDeatilsTable entity. @author MyEclipse Persistence Tools
 */

public class ConsultantExperienceDeatilsTable implements java.io.Serializable {

	// Fields

	private Long experienceId;
	private String organisationName;
	private String designation;
	private String skillsAquired;
	private String jobDescription;
	private String jobRole;

	// Constructors

	/** default constructor */
	public ConsultantExperienceDeatilsTable() {
	}

	/** full constructor */
	public ConsultantExperienceDeatilsTable(String organisationName,
			String designation, String skillsAquired, String jobDescription,
			String jobRole) {
		this.organisationName = organisationName;
		this.designation = designation;
		this.skillsAquired = skillsAquired;
		this.jobDescription = jobDescription;
		this.jobRole = jobRole;
	}

	// Property accessors

	public Long getExperienceId() {
		return this.experienceId;
	}

	public void setExperienceId(Long experienceId) {
		this.experienceId = experienceId;
	}

	public String getOrganisationName() {
		return this.organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSkillsAquired() {
		return this.skillsAquired;
	}

	public void setSkillsAquired(String skillsAquired) {
		this.skillsAquired = skillsAquired;
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobRole() {
		return this.jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

}