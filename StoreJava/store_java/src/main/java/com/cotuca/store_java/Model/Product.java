package com.cotuca.store_java.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

    @ManyToOne
    @JoinColumn(name = "supplierID", nullable = false)
    private Supplier supplierID;

    @ManyToOne
    @JoinColumn(name = "productCategoryID", nullable = false)
    private ProductCategory productCategoryID;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "unitPrice", nullable = false)
    private double unitPrice;

    @Column(name = "address", nullable = false)
    private int unitsInStock;

    @Column(name = "discounted", nullable = false )
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

    public Supplier getSupplierID() {
        return supplierID;
    }

    public ProductCategory getProductCategoryID() {
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
