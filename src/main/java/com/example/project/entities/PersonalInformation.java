package com.example.project.entities;

import com.example.project.enums.Gender;

import java.time.LocalDate;

public class PersonalInformation {
    private Long id;
    private LocalDate birthDate;
    private String nationalId;
    private String militaryStatus;
    private Gender gender;
    private String maritalStatus;

    public PersonalInformation() {
    }

    public PersonalInformation(Long id, LocalDate birthDate, String nationalId, String militaryStatus, Gender gender, String maritalStatus) {
        this.id = id;
        this.birthDate = birthDate;
        this.nationalId = nationalId;
        this.militaryStatus = militaryStatus;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getMilitaryStatus() {
        return militaryStatus;
    }

    public void setMilitaryStatus(String militaryStatus) {
        this.militaryStatus = militaryStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
}
