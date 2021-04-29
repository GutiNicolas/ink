package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import java.time.LocalDateTime
import java.util.*

@Document(collection = "paper")
data class Paper(var title: String, @Indexed var creator: String, var body: String, var description: String) {
    @Id
    val id: String = UUID.randomUUID().toString()
    val publishedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    @Transient
    val interaction: Interaction = Interaction(UUID.randomUUID().toString())
}