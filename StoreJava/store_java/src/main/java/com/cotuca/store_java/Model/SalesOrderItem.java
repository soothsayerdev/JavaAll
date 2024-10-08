package com.cotuca.store_java.Model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class SalesOrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesOrderID;

    @ManyToOne
    @JoinColumn(name = "productID", nullable = false)
    private Product productID;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "unitPrice", nullable = false)
    private double unitPrice;

    @Column(name = "discount", nullable = false)
    private double discount;

    public SalesOrderItem(){

    }

    public SalesOrderItem(int quantity, double unitPrice, double discount) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getSalesOrderID() {
        return salesOrderID;
    }

    public Product getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesOrderItem that = (SalesOrderItem) o;
        return salesOrderID == that.salesOrderID && productID == that.productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderID, productID);
    }

    @Override
    public String toString() {
        return "SalesOrderItem{" +
                "salesOrderID=" + salesOrderID +
                ", productID=" + productID +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                '}';
    }
}
