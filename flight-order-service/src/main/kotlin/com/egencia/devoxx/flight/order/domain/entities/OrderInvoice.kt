package com.egencia.devoxx.flight.order.domain.entities

import com.egencia.devoxx.flight.order.domain.DDD_Entity
import java.util.*


@DDD_Entity
class OrderInvoice(private val passengerNameRecord: String,
                   private val ticketNumber : String) {
    private val orderInvoiceId : String
    init {
        require(passengerNameRecord.length <= 7 &&
                ticketNumber.length <= 14)
        this.orderInvoiceId = UUID.randomUUID().toString()
    }

}