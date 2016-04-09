package com.connaissance.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * ConsultantRegisrationTable entity. @author MyEclipse Persistence Tools
 */

public class ConsultantRegisrationTable  implements java.io.Serializable {


    // Fields    

     private Long consultantId;
     private LeadGenerationCategoryTable leadGenerationCategoryTable;
     private String consultantName;
     private String address;
     private String mobileNumber;
     private String experience;
     private String userIdenfn;
     private Timestamp loginTime;
     private Timestamp logoutTime;
     private String emailId;
     private String password;
     private Integer refer;
     private String status;
     private String companyContactPersonName;
     private String type;
     private String lastName;
     private String officialMailid;
     private Set moreInformationTables = new HashSet(0);
     private Set bankDetailsTables = new HashSet(0);
     private Set referCandidateTables = new HashSet(0);
     private Set consultantReferalTables = new HashSet(0);


    // Constructors

    /** default constructor */
    public ConsultantRegisrationTable() {
    }

    
    /** full constructor */
    public ConsultantRegisrationTable(LeadGenerationCategoryTable leadGenerationCategoryTable, String consultantName, String address, String mobileNumber, String experience, String userIdenfn, Timestamp loginTime, Timestamp logoutTime, String emailId, String password, Integer refer, String status, String companyContactPersonName, String type, String lastName, String officialMailid, Set moreInformationTables, Set bankDetailsTables, Set referCandidateTables, Set consultantReferalTables) {
        this.leadGenerationCategoryTable = leadGenerationCategoryTable;
        this.consultantName = consultantName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.experience = experience;
        this.userIdenfn = userIdenfn;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
        this.emailId = emailId;
        this.password = password;
        this.refer = refer;
        this.status = status;
        this.companyContactPersonName = companyContactPersonName;
        this.type = type;
        this.lastName = lastName;
        this.officialMailid = officialMailid;
        this.moreInformationTables = moreInformationTables;
        this.bankDetailsTables = bankDetailsTables;
        this.referCandidateTables = referCandidateTables;
        this.consultantReferalTables = consultantReferalTables;
    }

   
    // Property accessors

    public Long getConsultantId() {
        return this.consultantId;
    }
    
    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    public LeadGenerationCategoryTable getLeadGenerationCategoryTable() {
        return this.leadGenerationCategoryTable;
    }
    
    public void setLeadGenerationCategoryTable(LeadGenerationCategoryTable leadGenerationCategoryTable) {
        this.leadGenerationCategoryTable = leadGenerationCategoryTable;
    }

    public String getConsultantName() {
        return this.consultantName;
    }
    
    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getExperience() {
        return this.experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getUserIdenfn() {
        return this.userIdenfn;
    }
    
    public void setUserIdenfn(String userIdenfn) {
        this.userIdenfn = userIdenfn;
    }

    public Timestamp getLoginTime() {
        return this.loginTime;
    }
    
    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public Timestamp getLogoutTime() {
        return this.logoutTime;
    }
    
    public void setLogoutTime(Timestamp logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRefer() {
        return this.refer;
    }
    
    public void setRefer(Integer refer) {
        this.refer = refer;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyContactPersonName() {
        return this.companyContactPersonName;
    }
    
    public void setCompanyContactPersonName(String companyContactPersonName) {
        this.companyContactPersonName = companyContactPersonName;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficialMailid() {
        return this.officialMailid;
    }
    
    public void setOfficialMailid(String officialMailid) {
        this.officialMailid = officialMailid;
    }

    public Set getMoreInformationTables() {
        return this.moreInformationTables;
    }
    
    public void setMoreInformationTables(Set moreInformationTables) {
        this.moreInformationTables = moreInformationTables;
    }

    public Set getBankDetailsTables() {
        return this.bankDetailsTables;
    }
    
    public void setBankDetailsTables(Set bankDetailsTables) {
        this.bankDetailsTables = bankDetailsTables;
    }

    public Set getReferCandidateTables() {
        return this.referCandidateTables;
    }
    
    public void setReferCandidateTables(Set referCandidateTables) {
        this.referCandidateTables = referCandidateTables;
    }

    public Set getConsultantReferalTables() {
        return this.consultantReferalTables;
    }
    
    public void setConsultantReferalTables(Set consultantReferalTables) {
        this.consultantReferalTables = consultantReferalTables;
    }
   








}