package com.practice.problemSolving;

// Example of fully encrypted class
public class FullyEncryptionEmployeeClass {

        private int employeeId;
        private String employeeName;
        private String employeeAddress;
        private String employeeContact;

        public FullyEncryptionEmployeeClass(int employeeId, String employeeName, String employeeAddress, String employeeContact) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.employeeAddress = employeeAddress;
            this.employeeContact = employeeContact;
        }
        
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeContact() {
        return employeeContact;
    }

    public int setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return employeeId;
    }

    public String setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return employeeName;
    }

    public String setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
        return employeeAddress;
    }

    public String setEmployeeContact(String employeeContact) {
        this.employeeContact = employeeContact;
        return employeeContact;
    }

    public static void main(String[] args) {
        FullyEncryptionEmployeeClass employee = new FullyEncryptionEmployeeClass(100, "John", "123 Main St", "555-1234");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Address: " + employee.getEmployeeAddress());
        System.out.println("Employee Contact: " + employee.getEmployeeContact());
    }

}
