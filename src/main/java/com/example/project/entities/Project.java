package com.example.project.entities;


import jakarta.persistence.*;

@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String projectName;
    private String projectType;
    private String department;
    private String vpnUsername;
    private String vpnPassword;
    private String environmentInfo;
    private String employee;

    public Project() {
    }

    public Project(int id, String projectName, String projectType, String department, String vpnUsername, String vpnPassword, String environmentInfo, String employee) {
        this.id = id;
        this.projectName = projectName;
        this.projectType = projectType;
        this.department = department;
        this.vpnUsername = vpnUsername;
        this.vpnPassword = vpnPassword;
        this.environmentInfo = environmentInfo;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getVpnUsername() {
        return vpnUsername;
    }

    public void setVpnUsername(String vpnUsername) {
        this.vpnUsername = vpnUsername;
    }

    public String getVpnPassword() {
        return vpnPassword;
    }

    public void setVpnPassword(String vpnPassword) {
        this.vpnPassword = vpnPassword;
    }

    public String getEnvironmentInfo() {
        return environmentInfo;
    }

    public void setEnvironmentInfo(String environmentInfo) {
        this.environmentInfo = environmentInfo;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
