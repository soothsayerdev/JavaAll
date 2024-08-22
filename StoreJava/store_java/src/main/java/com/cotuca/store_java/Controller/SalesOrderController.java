package com.cotuca.store_java.Controller;

import com.cotuca.store_java.Model.SalesOrder;
import com.cotuca.store_java.Repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales-orders")
public class SalesOrderController {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @GetMapping
    public List<SalesOrder> getAllSalesOrder() {
        return salesOrderRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalesOrder> getSalesOrderById(@PathVariable int id) {
        return salesOrderRepository.findById(id)
                .map(salesOrder -> ResponseEntity.ok().body(salesOrder))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SalesOrder createSalesOrder(@RequestBody SalesOrder salesOrder) {
        return salesOrderRepository.save(salesOrder);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalesOrder> updateSalesOrder(@PathVariable int id, @RequestBody SalesOrder salesOrderDetails) {
        return salesOrderRepository.findById(id)
                .map(salesOrder -> {
                    salesOrder.setEstimatedDeliveryDate(salesOrderDetails.getEstimatedDeliveryDate());
                    //
                    SalesOrder updateSalesOrder = salesOrderRepository.save(salesOrder);
                    return ResponseEntity.ok().body(updateSalesOrder);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSalesOrder(@PathVariable int id) {
        return salesOrderRepository.findById(id)
                .map(salesOrder -> {
                    salesOrderRepository.delete(salesOrder);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
