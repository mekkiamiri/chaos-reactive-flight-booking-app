package com.egencia.devoxx.flight.search.domain.valueobjects

import com.egencia.devoxx.flight.search.domain.DDD_ValueObject

@DDD_ValueObject
data class Location private constructor(val code : String){
    companion object {
        private val codesToNames = mapOf("PAR" to "PARIS", "MRS" to "Marseille")
        operator fun invoke(codeValue: String): Location {
            require(codeValue.length == 3 && codesToNames.containsKey(codeValue))
            return Location(codeValue)
        }
    }

    fun getName() = codesToNames.getOrElse(code) { "" }

}