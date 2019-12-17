package com.egencia.devoxx.flight.order.domain.aggregates

import com.egencia.devoxx.flight.order.domain.DDD_Aggregate
import com.egencia.devoxx.flight.order.domain.commands.OrderCommand
import com.egencia.devoxx.flight.order.domain.entities.OrderInvoice
import com.egencia.devoxx.flight.order.domain.valueobjects.*
import java.time.LocalDateTime
import java.util.*

@DDD_Aggregate
class FlightOrder (orderCommand: OrderCommand){
    //no getter and setter
    private val orderId : String
    private val orderDate : LocalDateTime
    private val status : OrderStatus
    private val price : Price
    private val flightProduct : FlightProduct
    private val travelerData: TravelerData
    private val paymentInfo : PaymentInfo
    //todo: add getter that gives copy
    private var orderInvoice : OrderInvoice?

    init {
        this.travelerData = TravelerData(orderCommand.firstName, orderCommand.lastName,
                orderCommand.email, orderCommand.address)
        this.flightProduct = FlightProduct(orderCommand.flightDetails)
        this.paymentInfo = PaymentInfo(orderCommand.cardNumber, orderCommand.expirationDate,
                orderCommand.cardVerificationValue)
        this.orderId = UUID.randomUUID().toString()
        this.orderDate = LocalDateTime.now()
        this.status = OrderStatus.PENDING
        this.price = Price(orderCommand.shoppingPrice)
        this.orderInvoice = null
        //to do raise event

    }




}