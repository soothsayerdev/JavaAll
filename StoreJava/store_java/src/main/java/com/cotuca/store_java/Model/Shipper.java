package com.cotuca.store_java.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Shipper {
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    public Shipper(){

    }

    public Shipper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "name='" + name + '\'' +
                '}';
    }
}
