package io.elice.shoppingmall.order.service;

import io.elice.shoppingmall.order.dto.OrderRequestDto;
import io.elice.shoppingmall.order.model.Orders;
import io.elice.shoppingmall.order.repository.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    // 주문 생성
    @Transactional
    public void createOrder(OrderRequestDto orderRequestDto) {
        Orders order = Orders.builder()
                .orderDate(orderRequestDto.getOrderDate())
                .deliveryDate(orderRequestDto.getDeliveryDate())
                .orderProcess(orderRequestDto.getOrderProcess())
                .receiver(orderRequestDto.getReceiver())
                .address(orderRequestDto.getAddress())
                .deliveryProcess(orderRequestDto.getDeliveryProcess())
                .request(orderRequestDto.getRequest())
                .totalCost(orderRequestDto.getTotalCost())
                .build();
        orderRepository.save(order);
    }

    // 전체 주문 조회
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    // 아이디로 특정 주문 조회
    public Orders getOrderById(Long id) {
        Optional<Orders> order = orderRepository.findById(id);
        if(!order.isPresent()) {
            throw new IllegalArgumentException();
        }
        return order.get();
    }

    // 주문 수정
    @Transactional
    public void updateOrder(Long id, OrderRequestDto orderRequestDto) {

        if(checkOrder(id)) {
            Optional<Orders> foundOrder = orderRepository.findById(id);
            Orders toUpdateOrder = foundOrder.get();
            toUpdateOrder.updateOrder(orderRequestDto);
            orderRepository.save(toUpdateOrder);
        }
    }

    // 주문 삭제(관리자 권한만)
    @Transactional
    public void deleteOrder(Long id ) {

        if(checkOrder(id)) {
            orderRepository.deleteById(id);
        }
    }

    // 수정, 삭제하고자하는 주문이 존재하는지 확인
    public boolean checkOrder(Long id) {
        Optional<Orders> foundOrder = orderRepository.findById(id);

        if(!foundOrder.isPresent()) {
            throw new IllegalArgumentException();
        }

        return true;
    }
}