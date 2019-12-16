package com.egencia.devoxx.flight.shopping

import com.oembedler.moon.graphql.boot.GraphQLJavaToolsAutoConfiguration
import com.oembedler.moon.graphql.boot.GraphQLWebAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlightShoppingServiceApplication

fun main() {
	runApplication<FlightShoppingServiceApplication>()
}
