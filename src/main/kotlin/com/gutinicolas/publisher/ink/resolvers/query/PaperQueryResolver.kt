package com.gutinicolas.publisher.ink.resolvers.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.gutinicolas.publisher.ink.exceptions.DataException
import com.gutinicolas.publisher.ink.model.api.Paper
import com.gutinicolas.publisher.ink.services.PublisherService
import com.gutinicolas.publisher.ruler.model.*
import org.springframework.stereotype.Component

@Component
class PaperQueryResolver(private val publisherService: PublisherService) : GraphQLQueryResolver {

    fun papers(): List<Paper> {
        return listOf(Paper("Titulo", "Nicolas", "Body del Post", "Un post de prueba"))
    }

    fun getPaper(id: String) : Paper {
        return publisherService.find(id) ?: throw DataException("No paper found for id = $id", mapOf("id" to id))
    }


    // User
    fun getUser(id: String, email: String): User {
        return buildUser()
    }

    fun validateSession(token: String): LoginResponse {
        return LoginResponse(buildUser(), Provider.SELF, "to21KSFu1tuUTG02")
    }

    fun deletePlaceHolder(id: String): PlaceHolderResponse {
        return PlaceHolderResponse("12490rAFISf02idsLW", Provider.SELF)
    }

    private fun buildUser(): User {
        var loginData = LoginData("skKA2KASD", Provider.SELF, "L4sTt0k3N")
        return User("username", "blogTitle", "profilePicture", "profile", loginData, "firstName", "lastName")
    }
}