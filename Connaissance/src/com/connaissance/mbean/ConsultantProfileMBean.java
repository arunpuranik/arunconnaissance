package com.connaissance.mbean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantReferalTable;
import com.connaissance.domain.ConsultantRegisrationTable;

public class ConsultantProfileMBean {

	private ConnIDelegate connIDelegate;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private List<ConsultantReferalTable> consultantReferalTablesList;
	private Long consultantId;
	private Long consultantReferalId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {

		consultantId = (Long) httpSession.getAttribute("CONSULTANTID");
		consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
				.getAttribute("CONNAISSANCEDETAILS");
		System.out.println("HIHIIIIII:::::::"
				+ consultantRegisrationTable.getConsultantId());
		this.connIDelegate = connIDelegate;
		consultantReferalTablesList = connIDelegate
				.getconsultantReferalTablesList();
	}

	public String getconsultantReferalTablesList() {

		Map<String, String> map = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap();
		consultantReferalId = Long.parseLong(map.get("consultantReferalId"));
		httpSession.setAttribute("consultantReferalId", consultantReferalId);
		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./candidatePofileEvalution.faces");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
				.getAttribute("CONNAISSANCEDETAILS");
		System.out.println("Profile details:::"
				+ consultantRegisrationTable.getConsultantName());
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public String updateRecord() {

		boolean isUpdated = connIDelegate
				.updateRecord(consultantRegisrationTable);
		if (isUpdated) {
			try {
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("./consultanthome.faces");
			} catch (IOException e) {
				e.printStackTrace();
			}
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Records updated!", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);

		} else {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Records not updated!", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

		return null;
	}

	public void addeducationRedirect() {
		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./consultantEducationDetailsPagej.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addExperienceRedirect() {
		try {

			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./consultantexperinceDetailsPagej.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

	public List<ConsultantReferalTable> getConsultantReferalTablesList() {
		return consultantReferalTablesList;
	}

	public void setConsultantReferalTablesList(
			List<ConsultantReferalTable> consultantReferalTablesList) {
		this.consultantReferalTablesList = consultantReferalTablesList;
	}

	public Long getConsultantReferalId() {
		return consultantReferalId;
	}

	public void setConsultantReferalId(Long consultantReferalId) {
		this.consultantReferalId = consultantReferalId;
	}

}
