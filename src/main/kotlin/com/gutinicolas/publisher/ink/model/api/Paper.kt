package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import java.time.LocalDateTime
import java.util.*

data class Paper(var title: String, var creator: String, var body: String, var description: String) {
    val id: String = UUID.randomUUID().toString()
    val publishedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    val interaction: Interaction = Interaction(UUID.randomUUID().toString())
}