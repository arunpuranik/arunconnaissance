package com.connaissance.service;

import java.util.List;

import com.connaissance.dao.ConnIDao;
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
import com.connaissance.mail.RegMail;
import com.connaissance.utill.Encription;
import com.connaissance.utill.SMSGateway;

public class ConnServiceImpl implements ConnIService {

	private ConnIDao connIDao;
	private Encription encription;
	private RegMail regMail;

	public ConnIDao getConnIDao() {
		return connIDao;
	}

	public void setConnIDao(ConnIDao connIDao) {
		this.connIDao = connIDao;
	}

	@Override
	public boolean regAdmin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails)
			throws Exception {

		boolean isSaved = false;
		cnnAdminMRegistrationDetails
				.setSuperAdminMPassword(encription
						.encript(cnnAdminMRegistrationDetails
								.getSuperAdminMPassword()));
		cnnAdminMRegistrationDetails
				.setSuperAdminMPosition(cnnAdminMRegistrationDetails
						.getSuperAdminMEmailid());

		String m_to = cnnAdminMRegistrationDetails.getSuperAdminMEmailid();
		String m_subject = "Registred Information";
		String m_text = "<html>" + "<body >"
				+ " <b style='color:deepskyblue;'>Dear    "
				+ cnnAdminMRegistrationDetails.getSuperAdminMName()
				+ "    Thank you for registering with us"
				+ "</b><br>"
				+ "<br>"
				+ "<br>"
				+ "<div style='background:#785B86;width:707px;height:auto;border:2px solid #7B868D;'>"
				+ "<div style='background:#fff;width: 707px;height: auto;margin-top:0px;border-radius:300px 0px 0px 0px;'>"
				+ "<img src='http://images.jdmagicbox.com/bangalore/h4/080pxx80.xx80.140603154007.s6h4/logo/f98e9df100f326a2a2ee2afe90fc8878.jpg' width='250' height='100' style='float:right;margin:5px;'>"
				+ "<div style='margin:auto;'>"
				+ "<br><br><div style='width:550px;height:auto;padding:10px;'>"
				+ "<table  cellpadding='5' cellspacing='0'  style='margin:auto;margin-top:33px;width:334px;'>"
				+ "<tr><td colspan='2' align='center'><font color=deepskyblue><h3>Your Personal Information</h3></font> </td></tr>"
				+ "<tr><td align='right'><b>Name:</b></td><td>"
				+ cnnAdminMRegistrationDetails.getSuperAdminMName()
				+ "</td></tr>"
				+ "<tr><td align='right'><b> Email Id:</b> </td><td>"
				+ cnnAdminMRegistrationDetails.getSuperAdminMEmailid()
				+ "</td></tr>"
				+ "<tr><td  align='right'><b> Contact Number: </b></td><td>  "
				+ cnnAdminMRegistrationDetails.getSuperAdminMContact()
				+ "</table>"
				+ "<br><br><br><br><br></div>"
				+ "</div>"
				+ "</div>"
				+ "<div style='font-weight:bold;font-size:29px;height:50px;width:800px;padding-top: 25px;padding-left: 203px;'>"
				+ "<a style='color:#fff;text-decoration:none;' href='http://www.connaissance.co'>www.connaissance.co</a>"
				+ "</div>" + "</div>" + "</body>" + "</html>";
		regMail.sendIt(m_to, m_subject, m_text);

		return connIDao.regAdmin(cnnAdminMRegistrationDetails);
	}

	public Encription getEncription() {
		return encription;
	}

	public void setEncription(Encription encription) {
		this.encription = encription;
	}

	@Override
	public boolean consultantSaveInfo(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception {

		consultantRegisrationTable.setPassword(encription
				.encript(consultantRegisrationTable.getPassword()));
		consultantRegisrationTable.setUserIdenfn(consultantRegisrationTable
				.getEmailId());
		String m_to = consultantRegisrationTable.getEmailId();
		String m_subject = "Registred Information";
		String m_text = "<html>" + "<body >"
				+ " <b style='color:deepskyblue;'>Dear    "
				+ consultantRegisrationTable.getConsultantName()
				+ "    Thank you for registering with us"
				+ "</b><br>"
				+ "<br>"
				+ "<br>"
				+ "<div style='background:#785B86;width:707px;height:auto;border:2px solid #7B868D;'>"
				+ "<div style='background:#fff;width: 707px;height: auto;margin-top:0px;border-radius:300px 0px 0px 0px;'>"
				+ "<img src='http://images.jdmagicbox.com/bangalore/h4/080pxx80.xx80.140603154007.s6h4/logo/f98e9df100f326a2a2ee2afe90fc8878.jpg' width='250' height='100' style='float:right;margin:5px;'>"
				+ "<div style='margin:auto;'>"
				+ "<br><br><div style='width:550px;height:auto;padding:10px;'>"
				+ "<table  cellpadding='5' cellspacing='0'  style='margin:auto;margin-top:33px;width:334px;'>"
				+ "<tr><td colspan='2' align='center'><font color=deepskyblue><h3>Your Personal Information</h3></font> </td></tr>"
				+ "<tr><td align='right'><b>Name:</b></td><td>"
				+ consultantRegisrationTable.getConsultantName()
				+ "</td></tr>"
				+ "<tr><td align='right'><b> Email Id:</b> </td><td>"
				+ consultantRegisrationTable.getEmailId()
				+ "</td></tr>"
				+ "<tr><td  align='right'><b> Contact Number: </b></td><td>  "
				+ consultantRegisrationTable.getMobileNumber()
				+ "<tr><td  align='right'><b> Address: </b></td><td>  "
				+ consultantRegisrationTable.getAddress()
				+ "<tr><td  align='right'><b> Experience: </b></td><td>  "
				+ consultantRegisrationTable.getExperience()
				+ "</table>"
				+ "<br><br><br><br><br></div>"
				+ "</div>"
				+ "</div>"
				+ "<div style='font-weight:bold;font-size:29px;height:50px;width:800px;padding-top: 25px;padding-left: 203px;'>"
				+ "<a style='color:#fff;text-decoration:none;' href='http://www.connaissance.co'>www.connaissance.co</a>"
				+ "</div>" + "</div>" + "</body>" + "</html>";
		regMail.sendIt(m_to, m_subject, m_text);
		String msg = "Welcome to CONNAISSANCE IT " + "\n"
				+ "Thank you for Signing Up with us";
		String mob = consultantRegisrationTable.getMobileNumber();
		String sid = consultantRegisrationTable.getConsultantName();
		String result;
		result = sid.toUpperCase();
		System.out.println("mob..........." + mob);
		String response = SMSGateway.SMSSender("abdulhcm", "697674", mob, msg
				+ result, "WEBSMS", "0");
		System.out.println("smsgateway.." + response);
		return connIDao.consultantSaveInfo(consultantRegisrationTable);
	}

	public RegMail getRegMail() {
		return regMail;
	}

	public void setRegMail(RegMail regMail) {
		this.regMail = regMail;
	}

	@Override
	public CnnAdminMRegistrationDetails corporateLogin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {

		cnnAdminMRegistrationDetails
				.setSuperAdminMPassword(encription
						.encript(cnnAdminMRegistrationDetails
								.getSuperAdminMPassword()));

		return connIDao.corporateLogin(cnnAdminMRegistrationDetails);
	}

	@Override
	public List validateCorporateStatus(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		return connIDao.validateCorporateStatus(cnnAdminMRegistrationDetails);
	}

	@Override
	public ConsultantRegisrationTable saveLoginMethod(
			ConsultantRegisrationTable consultantRegisrationTable)
			throws Exception {

		consultantRegisrationTable.setPassword(encription
				.encript(consultantRegisrationTable.getPassword()));

		return connIDao.saveLoginMethod(consultantRegisrationTable);
	}

	@Override
	public boolean SaveEducationDeatils(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		return connIDao.SaveEducationDeatils(consultantQualificationDeatils);
	}

	@Override
	public boolean sssssss(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		return connIDao.sssssss(consultantQualificationDeatils);
	}

	@Override
	public ConsultantRegisrationTable consultantLogin(
			ConsultantRegisrationTable consultantRegisrationTable) {

		consultantRegisrationTable.setPassword(encription
				.encript(consultantRegisrationTable.getPassword()));
		return connIDao.consultantLogin(consultantRegisrationTable);
	}

	@Override
	public List validateConsultantStatus(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIDao.validateConsultantStatus(consultantRegisrationTable);
	}

	@Override
	public boolean updateRecord(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIDao.updateRecord(consultantRegisrationTable);
	}

	@Override
	public boolean enquireIdMethod(
			CandidateEnquireIdTable candidateEnquireIdTable) {
		return connIDao.enquireIdMethod(candidateEnquireIdTable);
	}

	@Override
	public List<ConsultantQualificationTypeTable> getQualificationlist() {
		return connIDao.getQualificationlist();
	}

	@Override
	public boolean saveLeadGenerationCategory(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIDao.saveLeadGenerationCategory(leadGenerationCategoryTable);
	}

	@Override
	public List<LeadGenerationCategoryTable> getSulekhaLeads(Long superAdminMId) {
		return connIDao.getSulekhaLeads(superAdminMId);
	}

	@Override
	public LeadGenerationCategoryTable getReviseEditableTable(Long categoryId) {
		return connIDao.getReviseEditableTable(categoryId);
	}

	@Override
	public boolean delLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIDao.delLeadMethod(leadGenerationCategoryTable);
	}

	@Override
	public List<LeadGenerationCategoryTable> getleadGenerationCategoryTablesList() {
		return connIDao.getleadGenerationCategoryTablesList();
	}

	@Override
	public boolean checkApproval(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIDao.checkApproval(consultantRegisrationTable);
	}

	@Override
	public boolean SaveExperienceDeatils(
			ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable) {
		return connIDao.SaveExperienceDeatils(consultantExperienceDeatilsTable);
	}

	@Override
	public boolean commonSaveInfo(
			AllCommonRegistrationPage allCommonRegistrationPage) {

		allCommonRegistrationPage.setPassword(encription
				.encript(allCommonRegistrationPage.getPassword()));
		allCommonRegistrationPage.setUserIdenfn(allCommonRegistrationPage
				.getEmailId());
		String m_to = allCommonRegistrationPage.getEmailId();
		String m_subject = "Registred Information";
		String m_text = "<html>" + "<body >"
				+ " <b style='color:deepskyblue;'>Dear    "
				+ allCommonRegistrationPage.getFirstName()
				+ "    Thank you for registering with us"
				+ "</b><br>"
				+ "<br>"
				+ "<br>"
				+ "<div style='background:#785B86;width:707px;height:auto;border:2px solid #7B868D;'>"
				+ "<div style='background:#fff;width: 707px;height: auto;margin-top:0px;border-radius:300px 0px 0px 0px;'>"
				+ "<img src='http://images.jdmagicbox.com/bangalore/h4/080pxx80.xx80.140603154007.s6h4/logo/f98e9df100f326a2a2ee2afe90fc8878.jpg' width='250' height='100' style='float:right;margin:5px;'>"
				+ "<div style='margin:auto;'>"
				+ "<br><br><div style='width:550px;height:auto;padding:10px;'>"
				+ "<table  cellpadding='5' cellspacing='0'  style='margin:auto;margin-top:33px;width:334px;'>"
				+ "<tr><td colspan='2' align='center'><font color=deepskyblue><h3>Your Personal Information</h3></font> </td></tr>"
				+ "<tr><td align='right'><b>Name:</b></td><td>"
				+ allCommonRegistrationPage.getFirstName()
				+ "</td></tr>"
				+ "<tr><td align='right'><b> Email Id:</b> </td><td>"
				+ allCommonRegistrationPage.getEmailId()
				+ "</td></tr>"
				+ "<tr><td  align='right'><b> Contact Number: </b></td><td>  "
				+ allCommonRegistrationPage.getMobileNumber()
				+ "<tr><td  align='right'><b> Address: </b></td><td>  "
				+ allCommonRegistrationPage.getAddress()

				+ "</table>"
				+ "<br><br><br><br><br></div>"
				+ "</div>"
				+ "</div>"
				+ "<div style='font-weight:bold;font-size:29px;height:50px;width:800px;padding-top: 25px;padding-left: 203px;'>"
				+ "<a style='color:#fff;text-decoration:none;' href='http://www.connaissance.co'>www.connaissance.co</a>"
				+ "</div>" + "</div>" + "</body>" + "</html>";
		regMail.sendIt(m_to, m_subject, m_text);
		String msg = "Welcome to CONNAISSANCE IT " + "\n"
				+ "Thank you for Signing Up with us";
		String mob = allCommonRegistrationPage.getMobileNumber();
		String sid = allCommonRegistrationPage.getLastName();
		String result;

		result = sid.toUpperCase();
		System.out.println("mob..........." + mob);
		String response = SMSGateway.SMSSender("abdulhcm", "697674", mob, msg
				+ result, "WEBSMS", "0");
		System.out.println("smsgateway.." + response);
		return connIDao.commonSaveInfo(allCommonRegistrationPage);
	}

	@Override
	public boolean coomonSaveInfo(CommonRegisrationTable commonRegisrationTable)
			throws Exception {

		
		commonRegisrationTable.setUserIdenfn(commonRegisrationTable
				.getEmailId());

		String m_to = commonRegisrationTable.getEmailId();
		String m_subject = "Registred Information";
		String m_text = "<html>" + "<body >"
				+ " <b style='color:deepskyblue;'>Dear    "
				+ commonRegisrationTable.getFirstName()
				+ "    Thank you for registering with us"
				+ "</b><br>"
				+ "<br>"
				+ "<br>"
				+ "<div style='background:#785B86;width:707px;height:auto;border:2px solid #7B868D;'>"
				+ "<div style='background:#fff;width: 707px;height: auto;margin-top:0px;border-radius:300px 0px 0px 0px;'>"
				+ "<img src='http://images.jdmagicbox.com/bangalore/h4/080pxx80.xx80.140603154007.s6h4/logo/f98e9df100f326a2a2ee2afe90fc8878.jpg' width='250' height='100' style='float:right;margin:5px;'>"
				+ "<div style='margin:auto;'>"
				+ "<br><br><div style='width:550px;height:auto;padding:10px;'>"
				+ "<table  cellpadding='5' cellspacing='0'  style='margin:auto;margin-top:33px;width:334px;'>"
				+ "<tr><td colspan='2' align='center'><font color=deepskyblue><h3>Your Personal Information</h3></font> </td></tr>"
				+ "<tr><td align='right'><b>Name:</b></td><td>"
				+ commonRegisrationTable.getFirstName()
				+ commonRegisrationTable.getLastName()
				+ "</td></tr>"
				+ "<tr><td align='right'><b> Email Id:</b> </td><td>"
				+ commonRegisrationTable.getEmailId()
				+ "</td></tr>"
				+ "<tr><td  align='right'><b> Contact Number: </b></td><td>  "
				+ commonRegisrationTable.getContactNum()
				+ "<tr><td  align='right'><b> Address: </b></td><td>  "
				+ commonRegisrationTable.getAddress()

				+ "</table>"
				+ "<br><br><br><br><br></div>"
				+ "</div>"
				+ "</div>"
				+ "<div style='font-weight:bold;font-size:29px;height:50px;width:800px;padding-top: 25px;padding-left: 203px;'>"
				+ "<a style='color:#fff;text-decoration:none;' href='http://www.connaissance.co'>www.connaissance.co</a>"
				+ "</div>" + "</div>" + "</body>" + "</html>";
		regMail.sendIt(m_to, m_subject, m_text);

		String msg = "Welcome to CONNAISSANCE IT " + "\n"
				+ "Thank you for Signing Up with Us" + "";
		String mob = commonRegisrationTable.getContactNum();
		String sid = commonRegisrationTable.getFirstName()
				+ commonRegisrationTable.getLastName() + "\n"
				+ "This is Your WalkIn Id " + "\n"
				+ commonRegisrationTable.getWalkinId();
		System.out.println("walkin id is"
				+ commonRegisrationTable.getWalkinId());
		String result;
		result = sid.toUpperCase();
		System.out.println("mob..........." + mob);
		String response = SMSGateway.SMSSender("abdulhcm", "697674", mob, msg
				+ result, "WEBSMS", "0");
		System.out.println("smsgateway.." + response);
		return connIDao.coomonSaveInfo(commonRegisrationTable);
	}

	
	@Override
	public List<ConsultantRegisrationTable> getConsultantRegisrationTablesList() {
		return connIDao.getConsultantRegisrationTablesList();
	}

	@Override
	public List<ConsultantReferalTable> getconsultantReferalTablesList() {
		return connIDao.getconsultantReferalTablesList();
	}

	@Override
	public boolean saveReferCategory(
			ConsultantReferalTable consultantReferalTable) {
		return connIDao.saveReferCategory(consultantReferalTable);
	}

	@Override
	public boolean updateReferal(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIDao.updateReferal(consultantRegisrationTable);
	}

	@Override
	public String uploadmeResume(ConsultantReferalTable consultantReferalTable) {
		return connIDao.uploadmeResume(consultantReferalTable);
	}

	@Override
	public boolean editLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		return connIDao.editLeadMethod(leadGenerationCategoryTable);
	}

	@Override
	public boolean editApproveMethod(
			ConsultantRegisrationTable consultantRegisrationTable) {
		return connIDao.editApproveMethod(consultantRegisrationTable);
	}

	@Override
	public ConsultantRegisrationTable getApprovedEditValues(Long consultantId) {
		return connIDao.getApprovedEditValues(consultantId);
	}

	@Override
	public ConsultantReferalTable getEachCandidateDetails(
			Long consultantReferalId) {
		return connIDao.getEachCandidateDetails(consultantReferalId);
	}

}
