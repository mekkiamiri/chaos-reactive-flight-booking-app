package com.egencia.devoxx.flight.search.domain.valueobjects

import com.egencia.devoxx.flight.search.domain.DDD_ValueObject

@DDD_ValueObject
class Itinerary (val segments : List<Segment>){
    //todo : add getter to return copy of list
    //       add method to update list
}