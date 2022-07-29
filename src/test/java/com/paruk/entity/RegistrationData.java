package com.paruk.entity;

import java.util.Objects;

public class RegistrationData {
    private String studentNameText;
    private String studentEmailText;
    private String genderText;
    private String mobileText;
    private String dateOfBirthText;
    private String subjectsText;
    private String hobbiesText;
    private String pictureText;
    private String addressText;
    private String stateAndCityText;

    public RegistrationData() {
        studentNameText = "";
        studentEmailText = "";
        genderText = "";
        mobileText = "";
        dateOfBirthText = "";
        subjectsText = "";
        hobbiesText = "";
        pictureText = "";
        addressText = "";
        stateAndCityText = "";
    }

    public String getStudentNameText() {
        return studentNameText;
    }

    public void setStudentNameText(String studentNameText) {
        this.studentNameText += studentNameText;
    }

    public String getStudentEmailText() {
        return studentEmailText;
    }

    public void setStudentEmailText(String studentEmailText) {
        this.studentEmailText += studentEmailText;
    }

    public String getGenderText() {
        return genderText;
    }

    public void setGenderText(String genderText) {
        this.genderText += genderText;
    }

    public String getMobileText() {
        return mobileText;
    }

    public void setMobileText(String mobileText) {
        this.mobileText += mobileText;
    }

    public String getDateOfBirthText() {
        return dateOfBirthText;
    }

    public void setDateOfBirthText(String dateOfBirthText) {
        this.dateOfBirthText += dateOfBirthText;
    }

    public String getSubjectsText() {
        return subjectsText;
    }

    public void setSubjectsText(String subjectsText) {
        this.subjectsText += subjectsText;
    }

    public String getHobbiesText() {
        return hobbiesText;
    }

    public void setHobbiesText(String hobbiesText) {
        this.hobbiesText += hobbiesText;
    }

    public String getPictureText() {
        return pictureText;
    }

    public void setPictureText(String pictureText) {
        this.pictureText += pictureText;
    }

    public String getAddressText() {
        return addressText;
    }

    public void setAddressText(String addressText) {
        this.addressText += addressText;
    }

    public String getStateAndCityText() {
        return stateAndCityText;
    }

    public void setStateAndCityText(String stateAndCityText) {
        this.stateAndCityText = stateAndCityText;
    }

    @Override
    public String toString() {
        return "RegistrationData(" +
                "studentNameText='" + studentNameText + '\'' +
                ", studentEmailText='" + studentEmailText + '\'' +
                ", genderText='" + genderText + '\'' +
                ", mobileText='" + mobileText + '\'' +
                ", dateOfBirthText='" + dateOfBirthText + '\'' +
                ", subjectsText='" + subjectsText + '\'' +
                ", hobbiesText='" + hobbiesText + '\'' +
                ", pictureText='" + pictureText + '\'' +
                ", addressText='" + addressText + '\'' +
                ", stateAndCityText='" + stateAndCityText + '\'' +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistrationData)) return false;
        RegistrationData that = (RegistrationData) o;
        return Objects.equals(studentNameText, that.studentNameText) && Objects.equals(studentEmailText, that.studentEmailText) && Objects.equals(genderText, that.genderText) && Objects.equals(mobileText, that.mobileText) && Objects.equals(dateOfBirthText, that.dateOfBirthText) && Objects.equals(subjectsText, that.subjectsText) && Objects.equals(hobbiesText, that.hobbiesText) && Objects.equals(pictureText, that.pictureText) && Objects.equals(addressText, that.addressText) && Objects.equals(stateAndCityText, that.stateAndCityText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNameText, studentEmailText, genderText, mobileText, dateOfBirthText, subjectsText, hobbiesText, pictureText, addressText, stateAndCityText);
    }
}
