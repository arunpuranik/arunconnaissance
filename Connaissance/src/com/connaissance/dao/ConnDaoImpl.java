package com.connaissance.dao;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

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

@Transactional
public class ConnDaoImpl implements ConnIDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean regAdmin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {

		sessionFactory.getCurrentSession().save(cnnAdminMRegistrationDetails);
		return true;
	}

	String e;

	@Override
	public boolean consultantSaveInfo(
			ConsultantRegisrationTable consultantRegisrationTable) {
		boolean result = false;
		List list1 = sessionFactory
				.getCurrentSession()
				.createQuery(
						"select consultantId from ConsultantRegisrationTable")
				.list();
		if (list1.size() == 0) {
			Long x = 1L;
			e = x.toString();
		} else {
			List list = sessionFactory
					.getCurrentSession()
					.createQuery(
							"select max(consultantId) from ConsultantRegisrationTable")
					.list();
			for (Object object : list) {
				Long x = (Long) object;
				x = x + 1;
				e = x.toString();
			}
		}

		String qry = "from ConsultantRegisrationTable hr where hr.emailId='"
				+ consultantRegisrationTable.getEmailId() + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		consultantRegisrationTable.setRefer(0);
		List returnList = query.list();
		if (returnList.size() == 0) {
			getSessionFactory().getCurrentSession().save(
					consultantRegisrationTable);
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	@Override
	public CnnAdminMRegistrationDetails corporateLogin(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {
		CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails1 = null;
		String qry = "from CnnAdminMRegistrationDetails hr where hr.superAdminMEmailid='"
				+ cnnAdminMRegistrationDetails.getSuperAdminMEmailid()
				+ "' AND hr.superAdminMPassword='"
				+ cnnAdminMRegistrationDetails.getSuperAdminMPassword() + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		List returnList = query.list();
		if (returnList.size() != 0) {
			cnnAdminMRegistrationDetails1 = (CnnAdminMRegistrationDetails) returnList
					.get(0);
		}

		return cnnAdminMRegistrationDetails1;
	}

	@Override
	public List validateCorporateStatus(
			CnnAdminMRegistrationDetails cnnAdminMRegistrationDetails) {

		String status = "Active";
		String qry = "from CnnAdminMRegistrationDetails hr where hr.superAdminMEmailid='"
				+ cnnAdminMRegistrationDetails.getSuperAdminMEmailid()
				+ "' AND hr.superAdminMPassword='"
				+ cnnAdminMRegistrationDetails.getSuperAdminMPassword()
				+ "' and hr.status='" + status + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		List returnList = query.list();
		return returnList;
	}

	@Override
	public ConsultantRegisrationTable saveLoginMethod(
			ConsultantRegisrationTable consultantRegisrationTable) {

		ConsultantRegisrationTable mjRegisrationCheckTable1 = null;

		String qry = "from ConsultantRegisrationTable h where h.emailId='"
				+ consultantRegisrationTable.getEmailId() + "'AND h.password='"
				+ consultantRegisrationTable.getPassword() + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		List list = query.list();
		if (list.size() != 0) {
			mjRegisrationCheckTable1 = (ConsultantRegisrationTable) list.get(0);

		}

		return mjRegisrationCheckTable1;

	}

	@Override
	public boolean SaveEducationDeatils(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		sessionFactory.getCurrentSession().save(consultantQualificationDeatils);
		return true;
	}

	@Override
	public boolean sssssss(
			ConsultantQualificationDeatils consultantQualificationDeatils) {
		sessionFactory.getCurrentSession().save(consultantQualificationDeatils);
		return true;
	}

	@Override
	public ConsultantRegisrationTable consultantLogin(
			ConsultantRegisrationTable consultantRegisrationTable) {
		ConsultantRegisrationTable consultantRegisrationTable1 = null;
		String qry = "from ConsultantRegisrationTable hr where hr.emailId='"
				+ consultantRegisrationTable.getEmailId()
				+ "' AND hr.password='"
				+ consultantRegisrationTable.getPassword() + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		List returnList = query.list();
		if (returnList.size() != 0) {
			consultantRegisrationTable1 = (ConsultantRegisrationTable) returnList
					.get(0);
		}

		return consultantRegisrationTable1;
	}

	@Override
	public List validateConsultantStatus(
			ConsultantRegisrationTable consultantRegisrationTable) {
		String status = "Active";
		String qry = "from ConsultantRegisrationTable hr where hr.emailId='"
				+ consultantRegisrationTable.getEmailId()
				+ "' AND hr.password='"
				+ consultantRegisrationTable.getPassword()
				+ "' and hr.status='" + status + "'";
		Query query = getSessionFactory().getCurrentSession().createQuery(qry);
		List returnList = query.list();
		return returnList;
	}

	@Override
	public boolean updateRecord(
			ConsultantRegisrationTable consultantRegisrationTable) {
		sessionFactory.getCurrentSession().saveOrUpdate(
				consultantRegisrationTable);
		return true;
	}

	@Override
	public boolean enquireIdMethod(
			CandidateEnquireIdTable candidateEnquireIdTable) {
		String mj = "connSAP";
		List list = sessionFactory.getCurrentSession()
				.createQuery("from CandidateEnquireIdTable").list();

		if (list.size() == 0) {
			Long x = (long) 1;
			e = x.toString();

		} else {
			List list2 = sessionFactory
					.getCurrentSession()
					.createQuery(
							"select max(enqireId) from CandidateEnquireIdTable")
					.list();
			for (Object object : list2) {
				Long x = (Long) object;
				x = x + 1;
				e = x.toString();
			}
		}
		List<Integer> idList = new ArrayList<Integer>();
		for (int idi = 1; idi <= 3; idi++) {
			idList.add(idi + 4);
		}
		SecureRandom ids = new SecureRandom();
		String genId = new BigInteger(8, ids).toString(4);

		String f = mj.concat(e);

		candidateEnquireIdTable.setEnquireTypeId(f);

		String string = f.concat(genId);

		sessionFactory.getCurrentSession()
				.saveOrUpdate(candidateEnquireIdTable);
		return true;
	}

	@Override
	public List<ConsultantQualificationTypeTable> getQualificationlist() {
		List list = sessionFactory.getCurrentSession()
				.createQuery("from ConsultantQualificationTypeTable").list();
		System.out.println("HIHIHIHIHHIHIHIHOHO" + list.size());
		return list;
	}

	@Override
	public boolean saveLeadGenerationCategory(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Consultant")) {

			leadGenerationCategoryTable.setCategoryCode("CT");

		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Freelancer")) {
			leadGenerationCategoryTable.setCategoryCode("FR");

		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Only Reference")) {
			leadGenerationCategoryTable.setCategoryCode("OR");
		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Trainer Reference")) {
			leadGenerationCategoryTable.setCategoryCode("TR");
		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("PG Reference")) {
			leadGenerationCategoryTable.setCategoryCode("PG");
		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Inside Sales")) {
			leadGenerationCategoryTable.setCategoryCode("IS");
		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Channel Sales")) {
			leadGenerationCategoryTable.setCategoryCode("CH");
		} else if (leadGenerationCategoryTable.getLeadGenerationCategoryType()
				.equalsIgnoreCase("Marketing Leads")) {
			leadGenerationCategoryTable.setCategoryCode("ML");
		}

		if (leadGenerationCategoryTable.getSubCategoryType().equalsIgnoreCase(
				"Sales")) {
			leadGenerationCategoryTable.setSubcategoryCode("SL");

		} else if (leadGenerationCategoryTable.getSubCategoryType()
				.equalsIgnoreCase("Marketing")) {
			leadGenerationCategoryTable.setSubcategoryCode("MS");
		} else if (leadGenerationCategoryTable.getSubCategoryType()
				.equalsIgnoreCase("Authorised Consultant")) {
			leadGenerationCategoryTable.setSubcategoryCode("AC");
		}
		sessionFactory.getCurrentSession().save(leadGenerationCategoryTable);
		return true;
	}

	@Override
	public List<LeadGenerationCategoryTable> getSulekhaLeads(Long superAdminMId) {
		LeadGenerationCategoryTable generationCategoryTable = new LeadGenerationCategoryTable();
		List<LeadGenerationCategoryTable> list = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from LeadGenerationCategoryTable h where h.cnnAdminMRegistrationDetails.superAdminMId="
								+ superAdminMId).list();
		System.out.println("Size of list of category is" + list.size());
		if (list.size() != 0) {
			generationCategoryTable = (LeadGenerationCategoryTable) list.get(0);
		}
		return list;
	}

	@Override
	public LeadGenerationCategoryTable getReviseEditableTable(Long categoryId) {

		LeadGenerationCategoryTable categoryTable = null;
		List list = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from LeadGenerationCategoryTable h where h.categoryId="
								+ categoryId).list();
		if (list.size() != 0) {
			categoryTable = (LeadGenerationCategoryTable) list.get(0);
		}
		return categoryTable;
	}

	@Override
	public boolean delLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		sessionFactory.getCurrentSession().delete(leadGenerationCategoryTable);
		return true;
	}

	@Override
	public List<LeadGenerationCategoryTable> getleadGenerationCategoryTablesList() {
		List list = sessionFactory.getCurrentSession()
				.createQuery("from LeadGenerationCategoryTable").list();
		System.out.println("size of category is " + list.size());
		return list;
	}

	@Override
	public boolean checkApproval(
			ConsultantRegisrationTable consultantRegisrationTable) {

		String qry = "from ConsultantRegisrationTable hr where hr.consultantName='"
				+ consultantRegisrationTable.getConsultantName() + "'";
		List result = ((Query) getSessionFactory().getCurrentSession()
				.createQuery(qry)).list();

		if (result.size() == 0) {

			ConsultantRegisrationTable regisrationTable = (ConsultantRegisrationTable) result
					.get(0);
			regisrationTable.setOfficialMailid(consultantRegisrationTable
					.getOfficialMailid());
			System.out.println(consultantRegisrationTable.getOfficialMailid());
			getSessionFactory().getCurrentSession().update(regisrationTable);
			getSessionFactory().getCurrentSession().flush();

		}
		return true;
	}

	@Override
	public boolean SaveExperienceDeatils(
			ConsultantExperienceDeatilsTable consultantExperienceDeatilsTable) {

		sessionFactory.getCurrentSession().saveOrUpdate(
				consultantExperienceDeatilsTable);
		System.out.println("designation cmg frm daoimpl"
				+ consultantExperienceDeatilsTable.getDesignation());
		return true;
	}

	@Override
	public boolean commonSaveInfo(
			AllCommonRegistrationPage allCommonRegistrationPage) {
		sessionFactory.getCurrentSession().save(allCommonRegistrationPage);
		System.out.println("dao cmg from allcommonReg");
		return true;
	}

	@Override
	public boolean coomonSaveInfo(CommonRegisrationTable commonRegisrationTable) {
		String mj = "ConnWalkInId ";
		List list = sessionFactory.getCurrentSession()
				.createQuery("from CommonRegisrationTable").list();

		if (list.size() == 0) {
			Long x = (long) 1;
			e = x.toString();

		} else {
			List list2 = sessionFactory
					.getCurrentSession()
					.createQuery(
							"select max(commonRegId) from CommonRegisrationTable")
					.list();
			for (Object object : list2) {
				Long x = (Long) object;
				x = x + 1;
				e = x.toString();
			}
		}
		List<Integer> idList = new ArrayList<Integer>();
		for (int idi = 1; idi <= 3; idi++) {
			idList.add(idi + 4);
		}
		SecureRandom ids = new SecureRandom();
		String genId = new BigInteger(8, ids).toString(4);

		String f = mj.concat(e);

		commonRegisrationTable.setWalkinId(f);

		String string = f.concat(genId);

		sessionFactory.getCurrentSession().saveOrUpdate(commonRegisrationTable);
		return true;
	}

	@Override
	public List<ConsultantRegisrationTable> getConsultantRegisrationTablesList() {
		List list = sessionFactory.getCurrentSession()
				.createQuery("from ConsultantRegisrationTable").list();
		return list;
	}

	@Override
	public List<ConsultantReferalTable> getconsultantReferalTablesList() {
		List list = sessionFactory.getCurrentSession()
				.createQuery("from ConsultantReferalTable").list();
		return list;
	}

	@Override
	public boolean saveReferCategory(
			ConsultantReferalTable consultantReferalTable) {
		sessionFactory.getCurrentSession().save(consultantReferalTable);
		return true;
	}

	@Override
	public boolean updateReferal(
			ConsultantRegisrationTable consultantRegisrationTable) {
		sessionFactory.getCurrentSession().saveOrUpdate(
				consultantRegisrationTable);
		return true;
	}

	@Override
	public String uploadmeResume(ConsultantReferalTable consultantReferalTable) {
		List list1 = sessionFactory
				.getCurrentSession()
				.createQuery(
						"select consultantReferalId from ConsultantReferalTable")
				.list();
		if (list1.size() == 0) {
			Long x = 1L;
			e = x.toString();
		} else {
			List list = sessionFactory
					.getCurrentSession()
					.createQuery(
							"select max(consultantReferalId) from ConsultantReferalTable")
					.list();
			for (Object object : list) {
				Long x = (Long) object;
				x = x + 1;
				e = x.toString();
			}

		}
		return e;

	}

	@Override
	public boolean editLeadMethod(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		sessionFactory.getCurrentSession().saveOrUpdate(
				leadGenerationCategoryTable);
		return true;
	}

	@Override
	public boolean editApproveMethod(
			ConsultantRegisrationTable consultantRegisrationTable) {
		sessionFactory.getCurrentSession().saveOrUpdate(
				consultantRegisrationTable);
		return true;
	}

	@Override
	public ConsultantRegisrationTable getApprovedEditValues(Long consultantId) {
		ConsultantRegisrationTable regisrationTable = null;
		List list = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from ConsultantRegisrationTable h where h.consultantId="
								+ consultantId).list();
		if (list.size() != 0) {
			regisrationTable = (ConsultantRegisrationTable) list.get(0);
		}
		return regisrationTable;
	}
	@Override
	public ConsultantReferalTable getEachCandidateDetails(
			Long consultantReferalId) {

		ConsultantReferalTable referalTable = null;
		List list = sessionFactory
				.getCurrentSession()
				.createQuery(
						"from ConsultantReferalTable h where h.consultantReferalId="+consultantReferalId)
				.list();
		if (list.size() != 0) {
			referalTable = (ConsultantReferalTable) list.get(0);
		}
		return referalTable;
	}

}
