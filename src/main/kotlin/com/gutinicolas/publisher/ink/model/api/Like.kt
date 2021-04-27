package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

@Document(collection = "like")
data class Like(@Id val userId: String) {
    val likedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    val id: String = UUID.randomUUID().toString()
}