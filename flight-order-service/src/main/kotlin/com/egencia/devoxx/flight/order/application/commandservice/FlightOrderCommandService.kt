package com.egencia.devoxx.flight.order.application.commandservice

import com.egencia.devoxx.flight.order.domain.aggregates.FlightOrder
import com.egencia.devoxx.flight.order.domain.commands.OrderCommand
import org.springframework.stereotype.Service

@Service
class FlightOrderCommandService {

    fun searchFlight(orderCommand: OrderCommand) {
        val flight = FlightOrder(orderCommand)
        //todo save in database
        //return searchid of aggregate
        //then webapp will send query to get departure results
        //then command for selectd segment
        //and then query for return results

    }

    fun orderFlight() {
        println("test chaos")
    }

}