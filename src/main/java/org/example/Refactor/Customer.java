package org.example.Refactor;

public class Customer {
    private String name;
    private String email;
    private String address;
    private String zipCode;
    private CustomerType type;

    public Customer(String name, String email, String address, String zipCode, CustomerType type) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.type = type;
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

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
