package com.yechan.server.order.order.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.yechan.server.order.order.domain.QOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderQueryDslRepository {

    private static QOrder order = QOrder.order;
    private final JPAQueryFactory jpaQueryFactory;
}
