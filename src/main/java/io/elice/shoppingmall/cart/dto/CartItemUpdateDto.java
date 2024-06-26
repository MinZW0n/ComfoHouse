package io.elice.shoppingmall.cart.dto;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemUpdateDto {

    @Min(value = 1, message = "수량은 1개 이상이어야 합니다!")
    int quantity;
}
