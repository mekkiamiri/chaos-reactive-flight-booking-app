package com.egencia.devoxx.flight.shopping.domain.valueobjects

import com.egencia.devoxx.flight.shopping.domain.DDD_ValueObject

@DDD_ValueObject
class ProposedItineraries (val departureSegmetns : List<Segment>,
                           val returnSegmetns : List<Segment>) {
    //todo : add getter to return copy of list
    //       add method to update list
}