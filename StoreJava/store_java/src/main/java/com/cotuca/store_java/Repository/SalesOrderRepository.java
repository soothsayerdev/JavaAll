package com.cotuca.store_java.Repository;

import com.cotuca.store_java.Model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer> {
}
