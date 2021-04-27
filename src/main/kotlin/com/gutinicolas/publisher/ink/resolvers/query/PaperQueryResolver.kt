package com.gutinicolas.publisher.ink.resolvers.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.gutinicolas.publisher.ink.exceptions.DataException
import com.gutinicolas.publisher.ink.model.api.Paper
import com.gutinicolas.publisher.ink.services.PublisherService
import org.springframework.stereotype.Component

@Component
class PaperQueryResolver(private val publisherService: PublisherService) : GraphQLQueryResolver {

    fun papers(): List<Paper> {
        return listOf(Paper("Titulo", "Nicolas", "Body del Post", "Un post de prueba"))
    }

    fun getPaper(id: String) : Paper {
        return publisherService.find(id) ?: throw DataException("No paper found for id = $id", mapOf("id" to id))
    }
}