package com.egencia.devoxx.flight.order.domain.valueobjects

import com.egencia.devoxx.flight.order.domain.DDD_ValueObject
import org.joda.money.Money
import java.time.LocalDate
import java.time.LocalDateTime

@DDD_ValueObject
data class PaymentInfo(private val cardNumber: String,
                       private val expirationDate: LocalDate,
                       private val cardVerificationValue: String) {
    companion object {
        operator fun invoke(cardNumber: String,
                            expirationDate: LocalDate,
                            cardVerificationValue: String): PaymentInfo {
            require(expirationDate.isAfter(LocalDate.now()) &&
                    cardVerificationValue.length == 3 &&
                    cardNumber.length == 16)
            return PaymentInfo(cardNumber, expirationDate, cardVerificationValue)
        }
    }
}