package com.egencia.devoxx.flight.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlightOrderServiceApplication

fun main(args: Array<String>) {
	runApplication<FlightOrderServiceApplication>(*args)
}
