package com.egencia.devoxx.flight.order.domain.commands

import org.joda.money.Money
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class FlightDetail(val originCode: String,
                        val destinationCode: String,
                        val flightNumber: String,
                        val price : Money,
                        private val departureDateTimeAsString: String,
                        private val arrivalDateTimeAsString: String) {
    val departureDateTime: LocalDateTime
    val arrivalDateTime: LocalDateTime
    init {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        departureDateTime = LocalDateTime.parse(departureDateTimeAsString, formatter)
        arrivalDateTime = LocalDateTime.parse(arrivalDateTimeAsString, formatter)
    }
}