package com.gutinicolas.publisher.ink.resolvers.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.gutinicolas.publisher.ink.model.api.Paper
import com.gutinicolas.publisher.ink.model.api.Review
import com.gutinicolas.publisher.ink.services.PublisherService
import com.gutinicolas.publisher.ruler.model.*
import org.springframework.stereotype.Component
import java.util.*

@Component
class PaperMutationResolver(private val publisherService: PublisherService): GraphQLMutationResolver {

    fun publishPaper(title: String, creator: String, body: String, description: String): Paper {
        return publisherService.createPaper(title, creator, body, description)
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

    fun commentPaper(paperId: String, userId: String, content: String) : Review {
        return Review(UUID.randomUUID().toString(), "Un comment de prueba")
    }

    fun deleteComment(commentId: String, userId: String) : Boolean {
        return true
    }

    fun replyComment(originalComment: String, userId: String, content: String): Review {
        return Review(UUID.randomUUID().toString(), "Un comment respuesta de prueba")
    }


    // User
    fun login(email: String, provider: Provider, verifiedByProvider: Boolean = false, token: String): LoginResponse {
        return LoginResponse(buildUser(), Provider.SELF, "t0k3n")
    }

    fun registrationPlaceHolder(email: String, idToken: String, firstName: String, lastName: String, provider: Provider): PlaceHolderResponse {
        return PlaceHolderResponse("d21AdorI08kK", Provider.SELF)
    }

    fun register(email: String, firstName: String, lastName: String, username: String, blogName: String, blogDescription: String): User {
        return buildUser()
    }

    private fun buildUser(): User {
        var loginData = LoginData("skKA2KASD", Provider.SELF, "L4sTt0k3N")
        return User("username", "blogTitle", "profilePicture", "profile", loginData, "firstName", "lastName")
    }
}