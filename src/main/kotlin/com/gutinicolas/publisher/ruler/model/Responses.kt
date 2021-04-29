package com.gutinicolas.publisher.ruler.model

data class LoginResponse(val user: User, val loggingProvider: Provider, val token: String)

data class PlaceHolderResponse(val id: String, val provider: Provider, var status: PlaceHolderStatus = PlaceHolderStatus.CREATED)

enum class PlaceHolderStatus {
    CREATED, DELETED
}
