package com.connaissance.domain;

import java.util.Date;


/**
 * MoreInformationTable entity. @author MyEclipse Persistence Tools
 */

public class MoreInformationTable  implements java.io.Serializable {


    // Fields    

     private Long moreinfoId;
     private ConsultantRegisrationTable consultantRegisrationTable;
     private String name;
     private String address;
     private Date dateOfBirth;
     private Date anniversaryDate;
     private String currentCompany;


    // Constructors

    /** default constructor */
    public MoreInformationTable() {
    }

    
    /** full constructor */
    public MoreInformationTable(ConsultantRegisrationTable consultantRegisrationTable, String name, String address, Date dateOfBirth, Date anniversaryDate, String currentCompany) {
        this.consultantRegisrationTable = consultantRegisrationTable;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.anniversaryDate = anniversaryDate;
        this.currentCompany = currentCompany;
    }

   
    // Property accessors

    public Long getMoreinfoId() {
        return this.moreinfoId;
    }
    
    public void setMoreinfoId(Long moreinfoId) {
        this.moreinfoId = moreinfoId;
    }

    public ConsultantRegisrationTable getConsultantRegisrationTable() {
        return this.consultantRegisrationTable;
    }
    
    public void setConsultantRegisrationTable(ConsultantRegisrationTable consultantRegisrationTable) {
        this.consultantRegisrationTable = consultantRegisrationTable;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getAnniversaryDate() {
        return this.anniversaryDate;
    }
    
    public void setAnniversaryDate(Date anniversaryDate) {
        this.anniversaryDate = anniversaryDate;
    }

    public String getCurrentCompany() {
        return this.currentCompany;
    }
    
    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }
   








}