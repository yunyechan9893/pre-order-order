package com.yechan.server.order.order.dto;

import java.util.List;
import lombok.Getter;

@Getter
public class OrderRequest {

    private Long userId;
    private List<OrderDetailRequest> orderDetailRequests;
}
