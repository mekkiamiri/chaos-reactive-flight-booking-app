package com.egencia.devoxx.flight.order.domain.valueobjects

import com.egencia.devoxx.flight.order.domain.DDD_ValueObject

@DDD_ValueObject
data class TravelerData(private val firstName: String,
                        private val lastName: String,
                        private val email: String,
                        private val address: String) {

    companion object {
        operator fun invoke(firstName: String, lastName: String,
                            email: String, address: String): TravelerData {
            require(firstName.isNotBlank() && lastName.isNotBlank() &&
                    email.isNotBlank() && address.isNotBlank())
            return TravelerData(firstName, lastName, email, address)
        }
    }

}