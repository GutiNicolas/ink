package com.gutinicolas.publisher.ink.resolvers.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.gutinicolas.publisher.ink.model.api.Comment
import com.gutinicolas.publisher.ink.model.api.Paper
import org.springframework.stereotype.Component
import java.util.*

@Component
class PaperMutationResolver(): GraphQLMutationResolver {

    fun publishPaper(title: String, creator: String, body: String, description: String): Paper {
        return Paper("Titulo", "Nicolas", "Body del Post", "Un post de prueba")
    }

    fun deletePaper(id: String): Boolean {
        return true
    }

    fun updatePaper(id: String, title: String, body: String, description: String): Paper {
        return Paper("Titulo", "Nicolas", "Body del Post modificado?", "Un post de prueba (no se modifica)")
    }

    fun likePaper(paperId: String, userId: String): Boolean {
        return true
    }

    fun unLikePaper(paperId: String, userId: String) : Boolean {
        return true
    }

    fun commentPaper(paperId: String, userId: String, content: String) : Comment {
        return Comment(UUID.randomUUID().toString(), "Un comment de prueba")
    }

    fun deleteComment(commentId: String, userId: String) : Boolean {
        return true
    }

    fun replyComment(originalComment: String, userId: String, content: String): Comment {
        return Comment(UUID.randomUUID().toString(), "Un comment respuesta de prueba")
    }

}