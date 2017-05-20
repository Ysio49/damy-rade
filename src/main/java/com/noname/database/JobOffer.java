package com.noname.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobOffer {

    @Id
    @GeneratedValue
    private Long id;
    private Long companyId;
    private String description;
    private String field;
    private String img;

    private String region;
    private String city;
    private String jobType;
    private String contractType; //rodzaj pracy (np biurowa)
    private String timeType; //rodzaj etatu

    private String salary;
    private String addedDate;
    private String expireDate;
    private String skills;
    private String bonuses;

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getBonuses() {
        return bonuses;
    }

    public void setBonuses(String bonuses) {
        this.bonuses = bonuses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", description='" + description + '\'' +
                ", field='" + field + '\'' +
                ", img='" + img + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", jobType='" + jobType + '\'' +
                ", contractType='" + contractType + '\'' +
                ", timeType='" + timeType + '\'' +
                ", salary='" + salary + '\'' +
                ", addedDate='" + addedDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", skills='" + skills + '\'' +
                ", bonuses='" + bonuses + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
