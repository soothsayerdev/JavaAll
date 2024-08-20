package com.cotuca.store_java.Model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

public class Customer {

    @Id
    @GeneratedValue
    private int customerID;
    @Colum()
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public Customer(){

    }

    public Customer(String name, String address, String city, String state, String postalCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerID == customer.customerID && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerID, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
