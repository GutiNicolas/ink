package com.gutinicolas.publisher.ink.resolvers.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.gutinicolas.publisher.ink.model.api.Paper
import org.springframework.stereotype.Component

@Component
class PaperQueryResolver() : GraphQLQueryResolver {

    fun papers(): List<Paper> {
        return listOf(Paper("Titulo", "Nicolas", "Body del Post", "Un post de prueba"))
    }
}