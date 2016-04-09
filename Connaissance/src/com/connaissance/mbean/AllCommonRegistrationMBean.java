package com.connaissance.mbean;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.AllCommonRegistrationPage;

public class AllCommonRegistrationMBean {

	private AllCommonRegistrationPage allCommonRegistrationPage;
	private ConnIDelegate connIDelegate;
	private String cPassword;
	private String randomString;
	private String checkSecurityNos;
	private String noMsg;

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

	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

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

	public String commonSaveInfo() {

		boolean isSaved = false;

		try {

			if (randomString.equals(checkSecurityNos)) {

				if (allCommonRegistrationPage.getPassword().equals(cPassword)) {

					isSaved = connIDelegate
							.commonSaveInfo(allCommonRegistrationPage);
					System.out.println("Consultant name is"
							+ allCommonRegistrationPage.getFirstName());

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

	public AllCommonRegistrationPage getAllCommonRegistrationPage() {
		return allCommonRegistrationPage;
	}

	public void setAllCommonRegistrationPage(
			AllCommonRegistrationPage allCommonRegistrationPage) {
		this.allCommonRegistrationPage = allCommonRegistrationPage;
		random();
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

}
