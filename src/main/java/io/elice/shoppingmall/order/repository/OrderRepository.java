package io.elice.shoppingmall.order.repository;

import io.elice.shoppingmall.order.dto.OrderRequestDto;
import io.elice.shoppingmall.order.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

}