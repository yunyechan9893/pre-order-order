package com.yechan.server.order.order.dto;

import lombok.Getter;

@Getter
public class OrderDetailRequest {
    private Long productId;
    private Integer quantity;
}
