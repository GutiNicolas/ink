package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

@Document(collection = "review")
data class Review(val userId: String, var content: String) {
    val publishedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var deletionDate: LocalDateTime? = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var replies: List<Review> = ArrayList()
    @Id
    val id: String = UUID.randomUUID().toString()
}
