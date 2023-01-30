package com.company.companies.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "documents")
public class Document {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dueDate;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date noticeDate;
    private boolean isNoticed = false;
    private String note;
    private Integer idCompany;

    public Document() {
    }

    public Document(Integer id, String description, Date dueDate, Date noticeDate, boolean isNoticed,
            String note, Integer idEmpresa) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.noticeDate = noticeDate;
        this.isNoticed = isNoticed;
        this.note = note;
        this.idCompany = idEmpresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public boolean isNoticed() {
        return isNoticed;
    }

    public void setIsNoticed(boolean isNoticed) {
        this.isNoticed = isNoticed;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idEmpresa) {
        this.idCompany = idEmpresa;
    }

    

}
