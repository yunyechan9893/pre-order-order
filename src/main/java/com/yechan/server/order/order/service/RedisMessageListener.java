package com.yechan.server.order.order.service;

import com.yechan.server.order.config.Receiver;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisMessageListener implements MessageListener {

    private final Receiver receiver;

    @Override
    public void onMessage(Message message, byte[] pattern) {
        receiver.receiveMessage("hi");
    }
}
