package io.elice.shoppingmall.order.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.elice.shoppingmall.product.entity.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = "order_detail")
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long id;

    @Column(name = "created_at")
    @CreatedDate
    private Date createdAt;

    @Column(name = "modified_at")
    @LastModifiedDate
    private Date modifiedAt;

    @Column(name = "product_Name")
    private String productName;

    // 상품 구매 개수
    @NotNull
    @Min(1)
    private Long quantity;

    // 상품 가격
    @NotNull
    @Min(100)
    private Long price;

    // 주문과 다대일 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    @JsonBackReference
    private Orders order;
    
    // 상품과 1:1 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @JsonBackReference
    private Product product;

    @Builder
    public OrderDetail(Orders order, Product product, Long quantity, Long price, String productName) {

        this.product = product;
        this.order = order;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateOrderDetail(Long quantity) {
        this.quantity = quantity;
    }
}
