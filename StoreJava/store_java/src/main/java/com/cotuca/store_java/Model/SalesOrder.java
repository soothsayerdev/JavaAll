package com.cotuca.store_java.Model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Objects;

@Entity
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesOrderID;

    @ManyToOne
    @JoinColumn(name = "customerID", nullable = false)
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name = "employeeID", nullable = false)
    private Employee employeeID;

    @ManyToOne
    @JoinColumn(name = "shipperID", nullable = false)
    private Shipper shipperID;

    @Column(name = "orderDate", nullable = false)
    private Data orderDate;

    @Column(name = "estimatedDeliveryDate", nullable = false)
    private Data estimatedDeliveryDate;

    @Column(name = "freight", nullable = false)
    private double freight;

    @Column(name = "total", nullable = false)
    private double total;

    public SalesOrder(){

    }

    public SalesOrder(Data orderDate, Data estimatedDeliveryDate, double freight, double total) {
        this.orderDate = orderDate;
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        this.freight = freight;
        this.total = total;
    }

    public int getSalesOrderID() {
        return salesOrderID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public Shipper getShipperID() {
        return shipperID;
    }

    public Data getOrderDate() {
        return orderDate;
    }

    public Data getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public double getFreight() {
        return freight;
    }

    public double getTotal() {
        return total;
    }

    public void setOrderDate(Data orderDate) {
        this.orderDate = orderDate;
    }

    public void setEstimatedDeliveryDate(Data estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesOrder that = (SalesOrder) o;
        return salesOrderID == that.salesOrderID && employeeID == that.employeeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderID, employeeID);
    }

    @Override
    public String toString() {
        return "SalesOrder{" +
                "salesOrderID=" + salesOrderID +
                ", customerID=" + customerID +
                ", employeeID=" + employeeID +
                ", shipperID=" + shipperID +
                ", orderDate=" + orderDate +
                ", estimatedDeliveryDate=" + estimatedDeliveryDate +
                ", freight=" + freight +
                ", total=" + total +
                '}';
    }
}
