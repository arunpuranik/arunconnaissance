package com.connaissance.mbean;

import java.io.File;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.icefaces.ace.component.fileentry.FileEntry;
import org.icefaces.ace.component.fileentry.FileEntryEvent;
import org.icefaces.ace.component.fileentry.FileEntryResults;
import org.icefaces.ace.component.fileentry.FileEntryStatuses;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.ConsultantReferalTable;
import com.connaissance.domain.ConsultantRegisrationTable;

public class TestItMBean {

	private ConnIDelegate connIDelegate;
	private ConsultantReferalTable consultantReferalTable;
	private ConsultantRegisrationTable consultantRegisrationTable;
	private Long consultantId;
	private String eventManagementUploadId;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		consultantId = (Long) httpSession.getAttribute("CONSULTANTID");
		this.connIDelegate = connIDelegate;
	}

	public ConsultantReferalTable getConsultantReferalTable() {
		return consultantReferalTable;
	}

	public void setConsultantReferalTable(
			ConsultantReferalTable consultantReferalTable) {
		consultantId = (Long) httpSession.getAttribute("CONSULTANTID");
		httpSession.getAttribute("CONNAISSANCEDETAILS");
		this.consultantReferalTable = consultantReferalTable;
	}

	public ConsultantRegisrationTable getConsultantRegisrationTable() {
		return consultantRegisrationTable;
	}

	public void setConsultantRegisrationTable(
			ConsultantRegisrationTable consultantRegisrationTable) {
		consultantId = (Long) httpSession.getAttribute("CONSULTANTID");
		consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
				.getAttribute("CONNAISSANCEDETAILS");
		this.consultantRegisrationTable = consultantRegisrationTable;
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

	private Integer refer;

	public String saveReferCategory() {
		System.out.println("Bagee:::saveReferCategory:::");
		boolean isSaved = false;
		try {

			consultantId = (Long) httpSession.getAttribute("CONSULTANTID");
			consultantRegisrationTable = (ConsultantRegisrationTable) httpSession
					.getAttribute("CONNAISSANCEDETAILS");
			httpSession.setAttribute("REFERREGISTRATION",
					consultantReferalTable.getConsultantReferalId());
			consultantReferalTable.getConsultantRegisrationTable()
					.setConsultantId(consultantId);
			System.out
					.println("before" + consultantRegisrationTable.getRefer());
			isSaved = connIDelegate.saveReferCategory(consultantReferalTable);
			if (isSaved) {
				int refer = consultantRegisrationTable.getRefer() + 1;
				consultantRegisrationTable.setRefer(refer);
				System.out.println("if isSaved wat is the refered value::??"
						+ refer);
				isSaved = connIDelegate
						.updateReferal(consultantRegisrationTable);

			}

			FacesMessage message = new FacesMessage(
					FacesMessage.SEVERITY_INFO,
					"Thank you For Refering ,Our Risk Team Contact Soon For Evalution",
					"");
			FacesContext.getCurrentInstance().addMessage(null, message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

	public void uploadProfileImage(FileEntryEvent event) {

		System.out.println("hai mjbagee");
		FileEntry file = (FileEntry) event.getSource();
		FileEntryResults entryResults = file.getResults();
		for (FileEntryResults.FileInfo fileInfo : entryResults.getFiles()) {
			if (fileInfo.isSaved()) {
				if (!(((fileInfo.getFileName().endsWith(".pdf"))
						|| (fileInfo.getFileName().endsWith(".doc"))
						|| (fileInfo.getFileName().endsWith(".zip"))
						|| (fileInfo.getFileName().endsWith(".docx"))
						|| (fileInfo.getFileName().endsWith(".rar")) || (fileInfo
							.getFileName().endsWith(".txt")))))

				{
					fileInfo.updateStatus(
							FileEntryStatuses.INVALID_CONTENT_TYPE, true, true);
					return;
				}
				File savedFile = fileInfo.getFile();
				if (savedFile.getName().contains(" ")) {
					savedFile.renameTo(new File(savedFile.getPath().replaceAll(
							" ", "")));
				}
				HttpServletRequest request = (HttpServletRequest) FacesContext
						.getCurrentInstance().getExternalContext().getRequest();
				eventManagementUploadId = connIDelegate
						.uploadmeResume(consultantReferalTable);
				String upload = "http://localhost:8080" + "/connaissance.co"
						+ "/Member/upload/Documents/" + eventManagementUploadId
						+ "/" + "Profile/"
						+ fileInfo.getFileName().replaceAll(" ", "");
				System.out.println("bageemj file path is::before:>>>"
						+ consultantReferalTable.getFilePath());
				consultantReferalTable.setFilePath(upload);
				System.out.println("bageemj file path is::after:>>>"
						+ consultantReferalTable.getFilePath());

			}
		}
	}

	public Integer getRefer() {
		return refer;
	}

	public void setRefer(Integer refer) {
		this.refer = refer;
	}

	public String getEventManagementUploadId() {
		return eventManagementUploadId;
	}

	public void setEventManagementUploadId(String eventManagementUploadId) {
		this.eventManagementUploadId = eventManagementUploadId;
	}

}
