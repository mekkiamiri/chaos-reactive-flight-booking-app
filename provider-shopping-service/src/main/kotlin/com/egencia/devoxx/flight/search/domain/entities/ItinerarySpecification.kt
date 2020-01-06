package com.egencia.devoxx.flight.search.domain.entities

import com.egencia.devoxx.flight.search.domain.DDD_Entity
import com.egencia.devoxx.flight.search.domain.valueobjects.Location
import java.time.LocalDate
import java.util.*


@DDD_Entity
class ItinerarySpecification(private val origin: Location,
                             private val destination : Location,
                             private val  departureDate : LocalDate,
                             private val  returnDate : LocalDate ?) {
    private val routeSpecificationId : String
    init {
        require(origin != destination)
        returnDate?.let { require(returnDate.isAfter(departureDate)) }
        this.routeSpecificationId = UUID.randomUUID().toString()
    }

}