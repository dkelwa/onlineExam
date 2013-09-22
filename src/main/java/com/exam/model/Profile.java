package com.exam.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Profile implements Serializable {

    private Integer profileId;
    private String legalName;
    private String initiatedName;
    private String email;
    private String homePhone;
    private String cellPhone;
    private String city;
    private String state;
    private String country; // ***
    private Date dob;
    private String gender; // ***
    private String allergies;
    private String langPref;
    private String carBuPref;
    private String emergencyName;
    private String emergencyPhone1;
    private String emergencyPhone2;
    private Integer userId;

    public Integer getProfileId() {
	return profileId;
    }

    public void setProfileId(Integer profileId) {
	this.profileId = profileId;
    }

    public String getLegalName() {
	return legalName;
    }

    public void setLegalName(String legalName) {
	this.legalName = legalName;
    }

    public String getInitiatedName() {
	return initiatedName;
    }

    public void setInitiatedName(String initiatedName) {
	this.initiatedName = initiatedName;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getHomePhone() {
	return homePhone;

    }

    public void setHomePhone(String homePhone) {
	this.homePhone = homePhone;
    }

    public String getCellPhone() {
	return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
	this.cellPhone = cellPhone;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public Date getDob() {
	return dob;
    }

    public void setDob(Date dob) {
	this.dob = dob;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

    public String getAllergies() {
	return allergies;
    }

    public void setAllergies(String allergies) {
	this.allergies = allergies;
    }

    public String getLangPref() {
	return langPref;
    }

    public void setLangPref(String langPref) {
	this.langPref = langPref;
    }

    public String getCarBuPref() {
	return carBuPref;
    }

    public void setCarBuPref(String carBuPref) {
	this.carBuPref = carBuPref;
    }

    public String getEmergencyName() {
	return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
	this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone1() {
	return emergencyPhone1;
    }

    public void setEmergencyPhone1(String emergencyPhone1) {
	this.emergencyPhone1 = emergencyPhone1;
    }

    public String getEmergencyPhone2() {
	return emergencyPhone2;
    }

    public void setEmergencyPhone2(String emergencyPhone2) {
	this.emergencyPhone2 = emergencyPhone2;
    }

    public Integer getUserId() {
	return userId;
    }

    public void setUserId(Integer userId) {
	this.userId = userId;
    }

    @Override
    public String toString() {
	return "Profile [profileId=" + profileId + ", legalName=" + legalName
		+ ", initiatedName=" + initiatedName + ", email=" + email
		+ ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
		+ ", city=" + city + ", state=" + state + ", country="
		+ country + ", dob=" + dob + ", gender=" + gender
		+ ", allergies=" + allergies + ", langPref=" + langPref
		+ ", carBuPref=" + carBuPref + ", emergencyName="
		+ emergencyName + ", emergencyPhone1=" + emergencyPhone1
		+ ", emergencyPhone2=" + emergencyPhone2 + ", userId=" + userId
		+ "]";
    }
}
