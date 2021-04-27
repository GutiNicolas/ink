package com.gutinicolas.publisher.ink.model.api

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "interaction")
data class Interaction (@Id val id: String) {
    @Transient
    var likes: List<Like> = ArrayList()
    @Transient
    var reviews: List<Review> = ArrayList()
}