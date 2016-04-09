package com.connaissance.service;

import java.util.List;

import com.connaissance.domain.AllCommonRegistrationPage;
import com.connaissance.domain.CandidateEnquireIdTable;
import com.connaissance.domain.CnnAdminMRegistrationDetails;
import com.connaissance.domain.CommonRegisrationTable;
import com.connaissance.domain.ConsultantExperienceDeatilsTable;
import com.connaissance.domain.ConsultantQualificationDeatils;
import com.connaissance.domain.ConsultantQualificationTypeTable;
import com.connaissance.domain.ConsultantReferalTable;
import com.connaissance.domain.LeadGenerationCategoryTable;


import com.connaissance.domain.ConsultantRegisrationTable;

public interface ConnIService {

	boolean regAdmin(CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails)
			throws Exception;

	boolean consultantSaveInfo(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception;

	CnnAdminMRegistrationDetails corporateLogin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails);

	List validateCorporateStatus(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails);

	ConsultantRegisrationTable saveLoginMethod(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception;

	boolean SaveEducationDeatils(
			ConsultantQualificationDeatils consultantQualificationDeatils);

	boolean sssssss(
			ConsultantQualificationDeatils consultantQualificationDeatils);

	ConsultantRegisrationTable consultantLogin(
			ConsultantRegisrationTable consultantRegisrationTable);

	List validateConsultantStatus(
			ConsultantRegisrationTable consultantRegisrationTable);

	boolean updateRecord(ConsultantRegisrationTable consultantRegisrationTable);

	boolean enquireIdMethod(CandidateEnquireIdTable candidateEnquireIdTable);

	List<ConsultantQualificationTypeTable> getQualificationlist();

	boolean saveLeadGenerationCategory(
			LeadGenerationCategoryTable leadGenerationCategoryTable);

	List<LeadGenerationCategoryTable> getSulekhaLeads(Long superAdminMId);

	LeadGenerationCategoryTable getReviseEditableTable(Long categoryId);

	boolean delLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable);

	List<LeadGenerationCategoryTable> getleadGenerationCategoryTablesList();

	boolean checkApproval(ConsultantRegisrationTable consultantRegisrationTable);

	boolean SaveExperienceDeatils(
			ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable);

	boolean commonSaveInfo(AllCommonRegistrationPage allCommonRegistrationPage);

	boolean coomonSaveInfo(CommonRegisrationTable commonRegisrationTable)
			throws Exception;

	

	List<ConsultantRegisrationTable> getConsultantRegisrationTablesList();

	List<ConsultantReferalTable> getconsultantReferalTablesList();

	boolean saveReferCategory(ConsultantReferalTable consultantReferalTable);

	boolean updateReferal(ConsultantRegisrationTable consultantRegisrationTable);

	String uploadmeResume(ConsultantReferalTable consultantReferalTable);

	boolean editLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable);

	boolean editApproveMethod(
			ConsultantRegisrationTable consultantRegisrationTable);

	ConsultantRegisrationTable getApprovedEditValues(Long consultantId);

	ConsultantReferalTable getEachCandidateDetails(Long consultantReferalId);

}
