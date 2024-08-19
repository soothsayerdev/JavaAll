package com.cotuca.store_java.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

public class ProductCategory {
    @Id
    @GeneratedValue
    private int productCategoryID;
    private String name;
    private String description;

    public ProductCategory(){

    }

    public ProductCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getProductCategoryID() {
        return productCategoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return productCategoryID == that.productCategoryID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productCategoryID);
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "productCategoryID=" + productCategoryID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
