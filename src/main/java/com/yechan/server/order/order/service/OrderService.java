package com.yechan.server.order.order.service;

import com.yechan.server.order.order.repository.OrderRepository;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final RedisService redisService;

    public void create() {
        redisService.setValues("test", "test", Duration.ofMillis(5000));
    }

}
