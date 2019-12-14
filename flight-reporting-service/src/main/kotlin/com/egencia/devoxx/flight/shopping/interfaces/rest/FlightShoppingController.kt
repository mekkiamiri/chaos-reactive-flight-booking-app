package com.egencia.devoxx.flight.shopping.interfaces.rest

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.egencia.devoxx.flight.shopping.application.commandservice.FlightShoppingCommandService
import com.egencia.devoxx.flight.shopping.interfaces.rest.dto.FlightDetails
import org.springframework.stereotype.Controller

@Controller
class FlightShoppingController(private val flightShoppingCommandService: FlightShoppingCommandService) : GraphQLQueryResolver {

    //to test: http://localhost:8080/graphiq
    //{
    //  flightdetails(origin: "par", destination: "mar")
    //}
    fun flightDetails (pnr: String, provider: String) = FlightDetails("booked", "2019-05-01", "", "", "123456789")

}