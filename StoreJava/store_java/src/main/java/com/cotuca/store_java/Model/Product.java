package com.cotuca.store_java.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

public class Product {
    @Id
    @GeneratedValue
    private int productID;
    private int supplierID;
    private int productCategoryID;
    private String name;
    private double unitPrice;
    private int unitsInStock;
    private boolean discounted;

    public Product(){

    }

    public Product(String name, double unitPrice, int unitsInStock, boolean discounted) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.discounted = discounted;
    }

    public int getProductID() {
        return productID;
    }


    public int getSupplierID() {
        return supplierID;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && productCategoryID == product.productCategoryID && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productCategoryID, name);
    }

    @Override
    public java.lang.String toString() {
        return "Product{" +
                "productID=" + productID +
                ", supplierID=" + supplierID +
                ", productCategoryID=" + productCategoryID +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", unitsInStock=" + unitsInStock +
                ", discounted=" + discounted +
                '}';
    }
}
