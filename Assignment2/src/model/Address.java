/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author martta
 */
public class Address {
    private String streetAddress;
    private String unit;
    private String city;
    private String state;
    private String zip;

    public Address(String streetAddress, String unit, String city, String state, String zip) {
        this.streetAddress = streetAddress;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address(){
        
    }

    // Getters
    public String getStreetAddress() { return streetAddress; }
    public String getUnit() { return unit; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    // Setters
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    public void setUnitNumber(String unit) { this.unit = unit; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZip(String zip) { this.zip = zip; }
}

