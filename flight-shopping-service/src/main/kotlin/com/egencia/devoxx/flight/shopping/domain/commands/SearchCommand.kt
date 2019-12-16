package com.egencia.devoxx.flight.shopping.domain.commands

import java.time.LocalDate
import java.time.format.DateTimeFormatter


class SearchCommand (val originLocation: String,
                     val destLocation: String,
                     departureDateAsString: String,
                     returnDateAsString: String?) {
    val departureDate : LocalDate
    val returnDate : LocalDate?

    init {
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        departureDate = LocalDate.parse(departureDateAsString, formatter)
        returnDate = if (returnDateAsString.isNullOrEmpty()) null
                     else LocalDate.parse(returnDateAsString, formatter)
    }
}