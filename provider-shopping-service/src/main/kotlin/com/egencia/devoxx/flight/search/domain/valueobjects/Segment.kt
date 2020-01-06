package com.egencia.devoxx.flight.search.domain.valueobjects

import com.egencia.devoxx.flight.search.domain.DDD_ValueObject
import org.joda.money.Money
import java.time.LocalDateTime

@DDD_ValueObject
class Segment (val origin : Location, val destination: Location,
               val departureDateTime : LocalDateTime, val arrivalDateTime : LocalDateTime,
               val flightNumber : String, val price : Money) {
}