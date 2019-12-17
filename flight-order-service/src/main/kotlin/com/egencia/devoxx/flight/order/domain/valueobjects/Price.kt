package com.egencia.devoxx.flight.order.domain.valueobjects

import com.egencia.devoxx.flight.order.domain.DDD_ValueObject
import org.joda.money.Money
import java.math.BigDecimal

@DDD_ValueObject
data class Price private constructor(private val shoppingPrice: Money, private val orderPrice: Money? = null) {
    companion object {
        operator fun invoke(shoppingPriceValue: Money, orderPriceValue: Money? = null): Price {
            require(shoppingPriceValue.amount > BigDecimal.ZERO)
            return Price(shoppingPriceValue, orderPriceValue)
        }
    }
}