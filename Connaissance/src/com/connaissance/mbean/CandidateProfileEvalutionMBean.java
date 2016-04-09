package com.connaissance.mbean;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantReferalTable;

public class CandidateProfileEvalutionMBean {
	private ConnIDelegate connIDelegate;

	private ConsultantReferalTable consultantReferalTable;
	private Long consultantReferalId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;
	}

	public ConsultantReferalTable getConsultantReferalTable() {
		return consultantReferalTable;
	}

	public void setConsultantReferalTable(
			ConsultantReferalTable consultantReferalTable) {
		this.consultantReferalTable = consultantReferalTable;
		intilize();
	}

	private void intilize() {
		consultantReferalId = (Long) httpSession
				.getAttribute("consultantReferalId");
		this.consultantReferalTable=connIDelegate.getEachCandidateDetails(consultantReferalId);
	}

	public Long getConsultantReferalId() {
		return consultantReferalId;
	}

	public void setConsultantReferalId(Long consultantReferalId) {
		this.consultantReferalId = consultantReferalId;
	}

}
