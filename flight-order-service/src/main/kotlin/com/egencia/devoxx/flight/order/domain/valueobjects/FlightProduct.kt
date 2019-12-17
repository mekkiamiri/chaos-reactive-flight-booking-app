package com.egencia.devoxx.flight.order.domain.valueobjects

import com.egencia.devoxx.flight.order.domain.DDD_ValueObject
import com.egencia.devoxx.flight.order.domain.commands.FlightDetail

@DDD_ValueObject
data class FlightProduct(val flightDetails: List<FlightDetail>) {
    private val items = flightDetails.map {
        FlightProductItem(it.originCode, it.destinationCode, it.flightNumber,
                it.departureDateTime, it.arrivalDateTime)
    }

    //todo : add getter to return copy of list
    //       add method to update list
}