package com.egencia.devoxx.flight.shopping.application.commandservice

import com.egencia.devoxx.flight.shopping.domain.aggregates.Flight
import com.egencia.devoxx.flight.shopping.domain.commands.SearchCommand
import org.springframework.stereotype.Service

@Service
class FlightShoppingCommandService {

    fun searchFlight(searchCommand: SearchCommand) {
        val flight = Flight(searchCommand)
        //todo save in database
        //return searchid of aggregate
        //then webapp will send query to get departure results
        //then command for selectd segment
        //and then query for return results

    }
}