package org.example.Refactor;

public class Customer {
    private String name;
    private String email;
    private String address;
    private String zipCode;

    public Customer(String name, String email, String address, String zipCode) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
