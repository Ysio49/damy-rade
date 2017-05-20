package com.noname.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Employer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String img;
    private String about;
    //localisation
    private String city;
    private String region;
    private String telephone;
    private String emailAddress;
    private String webPage;
    private String offersId;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getOffersId() {
        return offersId;
    }

    public void setOffersId(String offersId) {
        this.offersId = offersId;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", about='" + about + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", telephone='" + telephone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", webPage='" + webPage + '\'' +
                ", offersId='" + offersId + '\'' +
                '}';
    }
}
