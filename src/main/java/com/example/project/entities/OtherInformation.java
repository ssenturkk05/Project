package com.example.project.entities;

public class OtherInformation {
    private int id;
    private String fullAddress;
    private String bankName;
    private String ibanNumber;
    private String emergencyContactName;
    private String emergencyContactPhoneNumber;

    public OtherInformation() {
    }

    public OtherInformation(int id, String fullAddress, String bankName, String ibanNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
        this.id = id;
        this.fullAddress = fullAddress;
        this.bankName = bankName;
        this.ibanNumber = ibanNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }

    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }
}
