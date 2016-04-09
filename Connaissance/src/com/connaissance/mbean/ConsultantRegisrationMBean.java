package com.connaissance.mbean;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantRegisrationTable;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class ConsultantRegisrationMBean {

	private ConsultantRegisrationTable consultantRegisrationTable;
	private ConnIDelegate connIDelegate;
	private String cPassword;
	private String randomString;
	private String checkSecurityNos;
	private String noMsg;
    private String type;
    private String companyContactPersonName;
    private List<LeadGenerationCategoryTable> leadGenerationCategoryTablesList;
    
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public String consultantSaveInfo() {

		boolean isSaved = false;

		try {

			httpSession.setAttribute("CONSULTANTID",
					consultantRegisrationTable.getConsultantId());
			httpSession.setAttribute("CONNAISSANCEDETAILS",
					consultantRegisrationTable);

			if (randomString.equals(checkSecurityNos)) {

				if (consultantRegisrationTable.getPassword().equals(cPassword)) {

					isSaved = connIDelegate
							.consultantSaveInfo(consultantRegisrationTable);
					System.out.println("Consultant name is"
							+ consultantRegisrationTable.getConsultantName());

					FacesContext.getCurrentInstance().getExternalContext()
							.redirect("../connaissance/login.faces");

				}

				else {
					setNoMsg("captcha worng...Try again..!");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	private List<Integer> intList = new ArrayList<Integer>();

	public List<Integer> getIntList() {
		return intList;
	}

	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}

	public void random() {
		for (int i = 1; i <= 4; i++) {
			intList.add(i + 5);
		}
		SecureRandom random = new SecureRandom();
		randomString = new BigInteger(8, random).toString(4);
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		this.consultantRegisrationTable = consultantRegisrationTable;
		random();
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
		leadGenerationCategoryTablesList=connIDelegate.getleadGenerationCategoryTablesList();
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}

	public String getCheckSecurityNos() {
		return checkSecurityNos;
	}

	public void setCheckSecurityNos(String checkSecurityNos) {
		this.checkSecurityNos = checkSecurityNos;
	}

	public String getNoMsg() {
		return noMsg;
	}

	public void setNoMsg(String noMsg) {
		this.noMsg = noMsg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompanyContactPersonName() {
		return companyContactPersonName;
	}

	public void setCompanyContactPersonName(String companyContactPersonName) {
		this.companyContactPersonName = companyContactPersonName;
	}

	public List<LeadGenerationCategoryTable> getLeadGenerationCategoryTablesList() {
		return leadGenerationCategoryTablesList;
	}

	public void setLeadGenerationCategoryTablesList(
			List<LeadGenerationCategoryTable> leadGenerationCategoryTablesList) {
		this.leadGenerationCategoryTablesList = leadGenerationCategoryTablesList;
	}

}
