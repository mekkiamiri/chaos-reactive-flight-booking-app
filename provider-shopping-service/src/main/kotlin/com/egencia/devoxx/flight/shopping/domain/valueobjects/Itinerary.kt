package com.egencia.devoxx.flight.shopping.domain.valueobjects

import com.egencia.devoxx.flight.shopping.domain.DDD_ValueObject

@DDD_ValueObject
class Itinerary (val segments : List<Segment>){
    //todo : add getter to return copy of list
    //       add method to update list
}