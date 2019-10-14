package com.jana.jpademo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Jana on 10/15/2019.
 */
@Entity
@Table(name = "PUBLICATION_NAME")
public class PublicationName {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACRONYM")
    private String acronym;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @ManyToOne
    private PublicationType publicationType;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PUBLICATION_NAME_ID")
    private List<ArticleType> articleTypeList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PUBLICATION_NAME_ID")
    private List<FileDownload> fileDownloadList;

    public List<ArticleType> getArticleTypeList() {
        return articleTypeList;
    }

    public void setArticleTypeList(List<ArticleType> articleTypeList) {
        this.articleTypeList = articleTypeList;
    }

    public PublicationType getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<FileDownload> getFileDownloadList() {
        return fileDownloadList;
    }

    public void setFileDownloadList(List<FileDownload> fileDownloadList) {
        this.fileDownloadList = fileDownloadList;
    }
}