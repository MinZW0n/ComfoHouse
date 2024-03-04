package io.elice.shoppingmall.product.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.elice.shoppingmall.product.dto.ReviewRequestDto;
import io.elice.shoppingmall.user.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column(nullable = false)
    private String context;

    @Column(name = "writer_nickname", nullable = false)
    private String writerNickname;

    @Column(name = "created_date", nullable = false)
    private LocalDate createdDate;

    @Column(nullable = false)
    private int rating;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    public void updateReview(String context, String writerNickname, LocalDate createdDate, int rating, Product product) {
        this.context = context;
        this.writerNickname = writerNickname;
        this.createdDate = createdDate;
        this.rating = rating;
        this.product = product;
    }

    public void updateReview(ReviewRequestDto reviewRequestDto){
        this.context = reviewRequestDto.getContext();
        this.writerNickname = reviewRequestDto.getWriterNickname();
        this.createdDate = reviewRequestDto.getCreatedDate();
        this.rating = reviewRequestDto.getRating();
    }
}
