package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantRegisrationTable;

public class ConnassianceHeaderMbean {

	private ConsultantRegisrationTable consultantRegisrationTable;
	private ConnIDelegate connIDelegate;
	private Integer refer;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(true);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
				.getAttribute("CONNAISSANCEDETAILS");
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public Integer getRefer() {
		return refer;
	}

	public void setRefer(Integer refer) {
		this.refer = refer;
	}

	public String validateAccount() {

		try {
			consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
					.getAttribute("CONNAISSANCEDETAILS");
			System.out.println("validate method::"
					+ consultantRegisrationTable.getRefer());
			if (consultantRegisrationTable.getRefer() >= 2) {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("./login.faces");

			} else if (consultantRegisrationTable.getRefer() == 0 || consultantRegisrationTable.getRefer()==1) {
				beforeReferedPopUP = true;

			}

		} catch (Exception e) {
		}

		return null;

	}

	public String referCandidate() {
		try {
			consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
					.getAttribute("CONNAISSANCEDETAILS");
			httpSession.setAttribute("REFERCANDI",
					consultantRegisrationTable.getConsultantId());
			System.out.println("iam moving referTable::"
					+ consultantRegisrationTable.getConsultantId());
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./testit.faces");

		} catch (Exception e) {
		}

		return null;
	}
	
	public String redirectLoginPage() {
		try {
			
			
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./login.faces");

		} catch (Exception e) {
		}

		return null;
	}

	private boolean beforeReferedPopUP;
	private boolean renderedPopUpInfoFromDes = true;

	public String commandLinkfordisplay() {

		System.out.println("HIHIHIHIHI");
		setBeforeReferedPopUP(true);
		return null;

	}

	public void eventPopValueRedirectFromDes() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./consultanthome.faces");
		} catch (Exception e) {
			e.printStackTrace();
		}

		setRenderedPopUpInfoFromDes(false);
	}

	public boolean isBeforeReferedPopUP() {
		return beforeReferedPopUP;
	}

	public void setBeforeReferedPopUP(boolean beforeReferedPopUP) {
		this.beforeReferedPopUP = beforeReferedPopUP;
	}

	public boolean isRenderedPopUpInfoFromDes() {
		return renderedPopUpInfoFromDes;
	}

	public void setRenderedPopUpInfoFromDes(boolean renderedPopUpInfoFromDes) {
		this.renderedPopUpInfoFromDes = renderedPopUpInfoFromDes;
	}

}
