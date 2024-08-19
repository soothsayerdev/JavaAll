package com.cotuca.store_java.Repository;

import com.cotuca.store_java.Model.SalesOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderItemRepository extends JpaRepository<SalesOrderItem, Integer> {
}
