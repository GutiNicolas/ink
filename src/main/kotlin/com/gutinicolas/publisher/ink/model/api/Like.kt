package com.gutinicolas.publisher.ink.model.api

import com.gutinicolas.publisher.ink.constants.TimeConstants
import java.time.LocalDateTime
import java.util.*

data class Like(val userId: String) {
    val likedDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    val id: String = UUID.randomUUID().toString()
}