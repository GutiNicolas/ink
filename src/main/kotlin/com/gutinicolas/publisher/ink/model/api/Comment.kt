package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

data class Comment(val userId: String, var content: String) {
    val publishedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var deletionDate: LocalDateTime? = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var replies: List<Comment> = ArrayList()
    val id: String = UUID.randomUUID().toString()
}