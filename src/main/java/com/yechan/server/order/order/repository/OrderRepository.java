package com.yechan.server.order.order.repository;

import com.yechan.server.order.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>, OrderQueryDslRepository {

}
