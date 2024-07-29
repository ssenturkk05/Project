package com.example.project.entities;

import com.example.project.enums.ContractType;
import com.example.project.enums.Level;
import com.example.project.enums.WorkType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private Long id;
    private String name;
    private String surname;
    private Level level;
    @Column(unique = true)
    @NotEmpty
    private String phoneNumber;
    private String email;
    private Date birthDate;
    private WorkType workType;
    private ContractType contractType;
    private String affiliatedTeam;
    private String startDateOfWork;
    private String contractEndDate;
    private String project;


    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAffiliatedTeam() {
        return affiliatedTeam;
    }

    public void setAffiliatedTeam(String affiliatedTeam) {
        this.affiliatedTeam = affiliatedTeam;
    }

    public String getStartDateOfWork() {
        return startDateOfWork;
    }

    public void setStartDateOfWork(String startDateOfWork) {
        this.startDateOfWork = startDateOfWork;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", level=" + level +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", workType='" + workType + '\'' +
                ", contractType='" + contractType + '\'' +
                ", affiliatedTeam='" + affiliatedTeam + '\'' +
                ", startDateOfWork='" + startDateOfWork + '\'' +
                ", contractEndDate='" + contractEndDate + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
