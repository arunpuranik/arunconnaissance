package com.connaissance.mbean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.connaissance.delegate.ConnIDelegate;
import com.connaissance.domain.LeadGenerationCategoryTable;

public class TestUpdateMBean {

	private ConnIDelegate connIDelegate;
	private Long categoryId;
	private LeadGenerationCategoryTable leadGenerationCategoryTable;
	private boolean formRendered;
	private boolean rendered = true;
	HttpSession httpSession = (HttpSession) FacesContext.getCurrentInstance()
			.getExternalContext().getSession(false);

	public ConnIDelegate getConnIDelegate() {
		return connIDelegate;
	}

	public void setConnIDelegate(ConnIDelegate connIDelegate) {
		this.connIDelegate = connIDelegate;

	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public LeadGenerationCategoryTable getLeadGenerationCategoryTable() {
		return leadGenerationCategoryTable;
	}

	public void setLeadGenerationCategoryTable(
			LeadGenerationCategoryTable leadGenerationCategoryTable) {
		this.leadGenerationCategoryTable = leadGenerationCategoryTable;
		httpSession.getAttribute("LEADGENERATION");
		categoryId = (Long) httpSession.getAttribute("categoryId");
		this.leadGenerationCategoryTable = connIDelegate
				.getReviseEditableTable(categoryId);

	}

	public boolean isFormRendered() {
		return formRendered;
	}

	public void setFormRendered(boolean formRendered) {
		this.formRendered = formRendered;
	}

	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(boolean rendered) {
		this.rendered = rendered;
	}

	/* Yes Button */
	public String delEventMethod() {
		httpSession.getAttribute("categoryId");
		System.out.println("meghana mj"
				+ leadGenerationCategoryTable.getCategoryId());
		boolean isSaved = false;
		try {
			isSaved = connIDelegate.delLeadMethod(leadGenerationCategoryTable);
			if (isSaved) {
				System.out.println("Edit Method ;;;;;;;");
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("./leadgenerationcategory.faces");
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Edit value is Successfully updated ........", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				setFormRendered(true);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/* No Button */
	public void eventDelete() {

		try {
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("./leadgenerationcategory.faces");

		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession currentSession = (HttpSession) FacesContext
				.getCurrentInstance().getExternalContext().getSession(false);
		currentSession.removeAttribute("categoryId");
		rendered = false;
	}
	
	public String editEventMethod() {
		httpSession.getAttribute("categoryId");
		
		boolean isSaved = false;
		try {
			isSaved = connIDelegate.editLeadMethod(leadGenerationCategoryTable);
			if (isSaved) {
				System.out.println("Edit Method ;;;;;;;");
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("./leadgenerationcategory.faces");
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Edit value is Successfully updated ........", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				setFormRendered(true);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
