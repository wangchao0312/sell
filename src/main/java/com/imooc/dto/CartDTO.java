package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * Created by 王超
 * 2019 05 18
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
