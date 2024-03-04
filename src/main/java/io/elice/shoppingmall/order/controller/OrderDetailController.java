package io.elice.shoppingmall.order.controller;

import io.elice.shoppingmall.order.dto.OrderDetailRequestDto;
import io.elice.shoppingmall.order.dto.OrderDetailUpdateDto;
import io.elice.shoppingmall.order.model.OrderDetail;
import io.elice.shoppingmall.order.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders/details")
public class OrderDetailController {

    private final OrderDetailService orderDetailService;

    // 특정 주문에 주문 상세 추가
    @PostMapping("/{id}")
    public ResponseEntity<Object> addOrderDetail(@PathVariable("id") Long id,
                                                 @RequestBody OrderDetailRequestDto orderDetailRequestDto) {

        return orderDetailService.createOrderDetail(id, orderDetailRequestDto);
    }

    // 특정 주문의 주문 상세내역 조회
    @GetMapping("/{id}")
    public Page<OrderDetail> getOrderDetailsByUser(@PathVariable("id") Long id,
                                                   @RequestParam(name = "page", defaultValue = "0") int page,
                                                   @RequestParam(name = "size", defaultValue = "3") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<OrderDetail> pagedOrderDetails = orderDetailService.getOrderDetailsByUser(id, pageRequest);

        return pagedOrderDetails;
    }

    @PutMapping("/{id}/detail/{detailId}")
    public ResponseEntity<Object> updateOrderDetail(@PathVariable("id") Long id,
                                                    @PathVariable("detailId") Long detailId,
                                                    @RequestBody OrderDetailUpdateDto orderDetailUpdateDto) {
        return orderDetailService.updateOrderDetail(id, detailId, orderDetailUpdateDto);
    }

    // 주문 상세 내역 삭제
    @DeleteMapping("/{id}/{detailId}")
    public ResponseEntity<Object> deleteOrderDetail(@PathVariable("id") Long orderId, @PathVariable("detailId") Long detailId) {

        return orderDetailService.deleteOrderDetail(orderId, detailId);
    }

    // 선택된 주문 상세내역 일괄 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteSelectedOrderDetails(@PathVariable("id") Long id,
                                                             @RequestBody List<Long> selectedDetailIds) {

        return orderDetailService.deleteSelectedDetails(id, selectedDetailIds);
    }
}
