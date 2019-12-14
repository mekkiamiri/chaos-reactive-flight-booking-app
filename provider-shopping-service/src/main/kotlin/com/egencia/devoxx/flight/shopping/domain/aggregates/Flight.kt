package com.egencia.devoxx.flight.shopping.domain.aggregates

import com.egencia.devoxx.flight.shopping.domain.DDD_Aggregate
import com.egencia.devoxx.flight.shopping.domain.commands.SearchCommand
import com.egencia.devoxx.flight.shopping.domain.entities.ItinerarySpecification
import com.egencia.devoxx.flight.shopping.domain.valueobjects.Itinerary
import com.egencia.devoxx.flight.shopping.domain.valueobjects.Location
import com.egencia.devoxx.flight.shopping.domain.valueobjects.ProposedItineraries
import java.util.*

@DDD_Aggregate
class Flight (searchCommand: SearchCommand){
    val flightId : String
    val itinerarySpecification: ItinerarySpecification
    //todo: add getter that gives copy
    lateinit var selectedItinerary : Itinerary
    //todo: add getter that gives copy
    lateinit var proposedItineraries : ProposedItineraries

    init {
        this.itinerarySpecification = ItinerarySpecification(Location(searchCommand.originLocation),
                Location(searchCommand.destLocation),
                searchCommand.departureDate,
                searchCommand.returnDate)
        this.flightId = UUID.randomUUID().toString()
        //to do raise event

    }




}