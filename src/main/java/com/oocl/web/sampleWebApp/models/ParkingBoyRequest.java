package com.oocl.web.sampleWebApp.models;

public class ParkingBoyRequest {
    private String employeeId;

    public ParkingBoyRequest() {

    }

    public ParkingBoyRequest(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
