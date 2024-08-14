package com.cotuca.store_java.Model;

public class Shipper {
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
