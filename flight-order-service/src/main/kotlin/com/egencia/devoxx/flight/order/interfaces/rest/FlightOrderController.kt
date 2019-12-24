package com.egencia.devoxx.flight.order.interfaces.rest

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.egencia.devoxx.flight.order.application.commandservice.FlightOrderCommandService
import com.egencia.devoxx.flight.order.interfaces.rest.dto.FlightDetails
import org.springframework.stereotype.Controller

@Controller
class FlightOrderController(private val flightOrderCommandService: FlightOrderCommandService) : GraphQLQueryResolver {

    //to test: http://localhost:8080/graphiq
    //{
    //  flightdetails(origin: "par", destination: "mar")
    //}
    fun processOrder (pnr: String, provider: String) = FlightDetails("booked", "2019-05-01", "", "", "123456789")

}