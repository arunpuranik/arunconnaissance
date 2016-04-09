package com.connaissance.delegate;

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
import com.connaissance.service.ConnIService;

public class ConnDelegateImpl implements ConnIDelegate {

	private ConnIService connIService;

	public ConnIService getConnIService() {
		return connIService;
	}

	public void setConnIService(ConnIService connIService) {
		this.connIService = connIService;
	}

	@Override
	public boolean regAdmin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails)
			throws Exception {
		return connIService.regAdmin(cnnAdminMRegistrationDetails);
	}

	@Override
	public boolean consultantSaveInfo(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception {
		return connIService.consultantSaveInfo(consultantRegisrationTable);
	}

	@Override
	public CnnAdminMRegistrationDetails corporateLogin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		return connIService.corporateLogin(cnnAdminMRegistrationDetails);
	}

	@Override
	public List validateCorporateStatus(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		return connIService
				.validateCorporateStatus(cnnAdminMRegistrationDetails);
	}

	@Override
	public ConsultantRegisrationTable saveLoginMethod(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception {
		return connIService.saveLoginMethod(consultantRegisrationTable);
	}

	@Override
	public boolean SaveEducationDeatils(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		return connIService
				.SaveEducationDeatils(consultantQualificationDeatils);
	}

	@Override
	public boolean sssssss(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		return connIService.sssssss(consultantQualificationDeatils);
	}

	@Override
	public ConsultantRegisrationTable consultantLogin(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService.consultantLogin(consultantRegisrationTable);
	}

	@Override
	public List validateConsultantStatus(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService
				.validateConsultantStatus(consultantRegisrationTable);
	}

	@Override
	public boolean updateRecord(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService.updateRecord(consultantRegisrationTable);
	}

	@Override
	public boolean enquireIdMethod(
			CandidateEnquireIdTable candidateEnquireIdTable) {
		return connIService.enquireIdMethod(candidateEnquireIdTable);
	}

	@Override
	public List<ConsultantQualificationTypeTable> getQualificationlist() {
		return connIService.getQualificationlist();
	}

	@Override
	public boolean saveLeadGenerationCategory(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIService
				.saveLeadGenerationCategory(leadGenerationCategoryTable);
	}

	@Override
	public List<LeadGenerationCategoryTable> getSulekhaLeads(Long superAdminMId) {
		return connIService.getSulekhaLeads(superAdminMId);
	}

	@Override
	public LeadGenerationCategoryTable getReviseEditableTable(Long categoryId) {
		return connIService.getReviseEditableTable(categoryId);
	}

	@Override
	public boolean delLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIService.delLeadMethod(leadGenerationCategoryTable);
	}

	@Override
	public List<LeadGenerationCategoryTable> getleadGenerationCategoryTablesList() {
		return connIService.getleadGenerationCategoryTablesList();
	}

	@Override
	public boolean checkApproval(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService.checkApproval(consultantRegisrationTable);
	}

	@Override
	public boolean SaveExperienceDeatils(
			ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable) {
		return connIService
				.SaveExperienceDeatils(consultantExperienceDeatilsTable);
	}

	@Override
	public boolean commonSaveInfo(
			AllCommonRegistrationPage allCommonRegistrationPage)
			throws Exception {
		return connIService.commonSaveInfo(allCommonRegistrationPage);
	}

	@Override
	public boolean coomonSaveInfo(CommonRegisrationTable commonRegisrationTable)
			throws Exception {
		return connIService.coomonSaveInfo(commonRegisrationTable);
	}

	

	@Override
	public List<ConsultantRegisrationTable> getConsultantRegisrationTablesList() {
		return connIService.getConsultantRegisrationTablesList();
	}

	@Override
	public List<ConsultantReferalTable> getconsultantReferalTablesList() {
		return connIService.getconsultantReferalTablesList();
	}

	@Override
	public boolean saveReferCategory(
			ConsultantReferalTable consultantReferalTable) {
		return connIService.saveReferCategory(consultantReferalTable);
	}

	@Override
	public boolean updateReferal(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService.updateReferal(consultantRegisrationTable);
	}

	@Override
	public String uploadmeResume(ConsultantReferalTable consultantReferalTable) {
		return connIService.uploadmeResume(consultantReferalTable);
	}

	@Override
	public boolean editLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIService.editLeadMethod(leadGenerationCategoryTable);
	}

	@Override
	public boolean editApproveMethod(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIService.editApproveMethod(consultantRegisrationTable);
	}

	@Override
	public ConsultantRegisrationTable getApprovedEditValues(Long consultantId) {
		return connIService.getApprovedEditValues(consultantId);
	}

	@Override
	public ConsultantReferalTable getEachCandidateDetails(
			Long consultantReferalId) {
		return connIService.getEachCandidateDetails(consultantReferalId);
	}

}
