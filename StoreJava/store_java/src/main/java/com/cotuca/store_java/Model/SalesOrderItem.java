package com.cotuca.store_java.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

public class SalesOrderItem {
    @Id
    @GeneratedValue
    private int salesOrderID;
    private int productID;
    private int quantity;
    private double unitPrice;
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

    public int getProductID() {
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
