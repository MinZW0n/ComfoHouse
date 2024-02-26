package io.elice.shoppingmall.product.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id; //상품코드

    @Column(name = "product_name", nullable = false, length = 255)
    private String productName; // 상품명

    @Column(name = "price", nullable = false)
    private int price; //가격

    @Column(name = "brand_name", length = 255)
    private String brandName; // 브랜드명

    @Column(nullable = false, length = 1000)
    private String content; // 내용

    @Column(name = "comment_count")
    private int commentCount; // 댓글 수

    @Column(name = "created_date")
    private LocalDate createdDate; // 생성일

    @Column(name = "product_image_url", length = 1000)
    private String productImageUrl; // 상품 이미지 URL

    @Column(name = "delivery_price")
    private int deliveryPrice; // 배송 비용

    @Column(name = "average_score")
    private int averageScore; // 평균 평점

    @Column(name = "review_count")
    private int reviewCount; // 리뷰 수

    @Column(name="discount_price")
    private int discountPrice;

    /*
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private OrderDetail orderDetail;

    @OneToMany(mappedBy = "product")
    private List<UserLike> userLikes;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

    @OneToMany(mappedBy = "product")
    private List<Option> options;

    @OneToMany(mappedBy = "product")
    private List<UserScrap> userScrap;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category categoryid;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Cart carts;
    */
}
