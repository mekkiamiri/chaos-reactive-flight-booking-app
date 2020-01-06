package com.egencia.devoxx.flight.search.interfaces.rest.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class Flight (val origin: String,
                   val destination: String,
                   val airline : Airline,
                   val flightNumber: String,
                   val departureDateTime: LocalDateTime,
                   val arrivalDateTime: LocalDateTime,
                   val price: Price)

data class Airline (val name: String,
                    val code: String)

data class Price (val amount: BigDecimal,
                  val currency: String)


