package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.CommonRegisrationTable;

public class CommonRegistartionMBean {

	private CommonRegisrationTable commonRegisrationTable;
	private ConnIDelegate connIDelegate;
	private String cPassword;
	private boolean registredSucessPopUP;

	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public String coomonSaveInfo() {

		boolean isSaved = false;

		try {

			isSaved = connIDelegate.coomonSaveInfo(commonRegisrationTable);
			System.out.println("save info cmg from  common MBEAN"
					+ commonRegisrationTable.getFirstName());
			registredSucessPopUP = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public String linkforNewAccount() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissance/commonregistration.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public String linkforIT() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissance/itinformation.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public String linkforProduct() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissance/productEngg.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public String linkforBus() {

		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissance/Businessand cons.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	private boolean closePopUp = true;

	public void backToRegistrationPopUp() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./connaissance/commonregistration.faces");
		} catch (Exception e) {
			e.printStackTrace();
		}

		setClosePopUp(false);

	}

	public CommonRegisrationTable getCommonRegisrationTable() {
		return commonRegisrationTable;
	}

	public void setCommonRegisrationTable(
			CommonRegisrationTable commonRegisrationTable) {
		this.commonRegisrationTable = commonRegisrationTable;
	}

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public boolean isRegistredSucessPopUP() {
		return registredSucessPopUP;
	}

	public void setRegistredSucessPopUP(boolean registredSucessPopUP) {
		this.registredSucessPopUP = registredSucessPopUP;
	}

	public boolean isClosePopUp() {
		return closePopUp;
	}

	public void setClosePopUp(boolean closePopUp) {
		this.closePopUp = closePopUp;
	}

}
