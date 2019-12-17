package com.egencia.devoxx.flight.order.domain.aggregates

enum class OrderStatus {
    PENDING,
    BOOKED,
    CANCELLED,
    FAILED
}