/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Address;

/**
 *
 * @author martta
 */
public class Person {
    private String firstname;
    private String lastName;
    private String SSN;
    private String licenseNumber;

    private Address homeAddress;
    private Address workAddress;

    public Person(String firstname, String lastName, String SSN, String licenseNumber, Address homeAddress, Address workAddress) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.SSN = SSN;
        this.licenseNumber = licenseNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public Person() {
        workAddress = new Address();
        homeAddress = new Address();
    }

    

    // Getters and Setters for personal info
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSSN() { return SSN; }
    public void setSSN(String SSN) { this.SSN = SSN; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    // Methods to update address details
    public void updateHomeAddress(Address homeAddress) { this.homeAddress = homeAddress; }
    public void updateWorkAddress(Address workAddress) { this.workAddress = workAddress; }

    // Address getters for display purpose, ensure encapsulation
    public Address getHomeAddress() { return homeAddress; }
    public Address getWorkAddress() { return workAddress; }

    @Override
    public String toString(){
        return firstname;
    }
}


    
    
    
    
