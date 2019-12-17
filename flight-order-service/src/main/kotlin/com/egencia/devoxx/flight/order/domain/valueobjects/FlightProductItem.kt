package com.egencia.devoxx.flight.order.domain.valueobjects

import com.egencia.devoxx.flight.order.domain.DDD_ValueObject
import java.time.LocalDateTime

@DDD_ValueObject
data class FlightProductItem private constructor(private val originCode: String,
                                                 private val destinationCode: String,
                                                 private val flightNumber: String,
                                                 private val departureDateTime: LocalDateTime,
                                                 private val arrivalDateTime: LocalDateTime){
    companion object {
        operator fun invoke(originCode: String,
                            destinationCode: String,
                            flightNumber: String,
                            departureDateTime: LocalDateTime,
                            arrivalDateTime: LocalDateTime): FlightProductItem {
            require(originCode.length == 3 && destinationCode.length == 3
                    && originCode != destinationCode)
            arrivalDateTime.let { require(arrivalDateTime.isAfter(departureDateTime)) }
            return FlightProductItem(originCode, destinationCode, flightNumber,
                    departureDateTime, arrivalDateTime)
        }
    }


}