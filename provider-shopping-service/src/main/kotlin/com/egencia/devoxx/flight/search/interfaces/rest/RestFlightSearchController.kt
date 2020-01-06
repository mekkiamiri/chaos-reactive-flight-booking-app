package com.egencia.devoxx.flight.search.interfaces.rest

import com.egencia.devoxx.flight.search.application.commandservice.FlightShoppingCommandService
import com.egencia.devoxx.flight.search.domain.commands.SearchCommand
import com.egencia.devoxx.flight.search.interfaces.rest.dto.Flight
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class RestFlightSearchController(private val flightShoppingCommandService: FlightShoppingCommandService) {
    //http://localhost:8080/flightsearch?origin=par&destination=mar&departure=2020-05-21&return=2020-06-21
    @GetMapping(value = ["/flightsearch"], produces = ["application/json"])
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun searchFlight(@RequestParam(value = "origin") origin: String,
                            @RequestParam(value = "destination") destination:String,
                            @RequestParam(value = "departureDate") departureDate:String,
                            @RequestParam(value = "returnDate") returnDate:String): Flight {

        val flightCommand = SearchCommand(origin, destination, departureDate, returnDate)
        flightShoppingCommandService.searchFlight(flightCommand)

        return Flight("booked", "2019-05-01", "", "", "123456789")
    }

}