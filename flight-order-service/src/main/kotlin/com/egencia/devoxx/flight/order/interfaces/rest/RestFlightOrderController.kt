package com.egencia.devoxx.flight.order.interfaces.rest

import com.egencia.devoxx.flight.order.application.commandservice.FlightOrderCommandService
import com.egencia.devoxx.flight.order.interfaces.rest.dto.FlightDetails
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class RestFlightOrderController(private val flightOrderCommandService: FlightOrderCommandService) {
    //http://localhost:8080/flightOrder?origin=par
    @GetMapping(value = ["/flightOrder"], produces = ["application/json"])
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun flightDetailsSearch(@RequestParam(value = "origin") origin: String
                            /*@RequestParam(value = "destination") destination:String,
                            @RequestParam(value = "departureDate") departureDate:String,
                            @RequestParam(value = "returnDate") returnDate:String*/): FlightDetails {

        //val flightCommand = OrderCommand(origin, destination, departureDate, returnDate)
        flightOrderCommandService.orderFlight()

        return FlightDetails("booked", "2019-05-01", "", "", "123456789")
    }

}