package com.egencia.devoxx.flight.shopping

import com.oembedler.moon.graphql.boot.GraphQLJavaToolsAutoConfiguration
import com.oembedler.moon.graphql.boot.GraphQLWebAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [GraphQLWebAutoConfiguration::class, GraphQLJavaToolsAutoConfiguration::class])
class PnrAnalyserServiceApplication

fun main() {
	runApplication<PnrAnalyserServiceApplication>()
}
