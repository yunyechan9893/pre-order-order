package com.yechan.server.order.order.controller;

import com.yechan.server.order.order.dto.OrderRequest;
import com.yechan.server.order.order.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import com.yechan.server.order.common.dto.CommonResult;
import com.yechan.server.order.common.service.ResponseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ResponseService responseService;

    @PostMapping
    public CommonResult create(
//        @Valid
//        @RequestBody
//        OrderRequest orderRequest
    ) {
        orderService.create();

        return responseService.getSuccessResult();
    }

}
