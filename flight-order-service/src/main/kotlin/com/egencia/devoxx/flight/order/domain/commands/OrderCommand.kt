package com.egencia.devoxx.flight.order.domain.commands

import org.joda.money.Money
import java.time.LocalDate


data class OrderCommand(val firstName: String,
                        val lastName: String,
                        val email: String,
                        val address: String,
                        val cardNumber: String,
                        val expirationDate: LocalDate,
                        val cardVerificationValue: String,
                        val flightDetails: List<FlightDetail>
) {
    val shoppingPrice: Money

    init {
        require(flightDetails.isNotEmpty())
        var totalPrice = Money.zero(flightDetails[0].price.currencyUnit)
        flightDetails.forEach { totalPrice = totalPrice.plus(it.price) }
        shoppingPrice = totalPrice
    }
}