package com.gutinicolas.publisher.ruler.model

import com.gutinicolas.publisher.ink.constants.TimeConstants
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

@Document(collection = "userBorrower")
data class UserBorrower(val idToken: String, val email: String, val firstName: String, val lastName: String, val provider: Provider) {
    @Id
    val id: String = UUID.randomUUID().toString()
    val creationDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
}

@Document(collection = "user")
data class User(@Indexed var username: String, var blogTitle: String, var blogDescription: String,
                var profilePicture: String,  var loginData: LoginData, val firstName: String, val lastName: String) {
    @Id
    val id: String = UUID.randomUUID().toString()
    val firstSeenDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var emails: List<Email> = ArrayList()
    var phones: List<Phone> = ArrayList()
    var verifiedUser: Boolean = false
    var userRole: UserRole = UserRole.USER
}

data class LoginData(var refreshToken: String, var provider: Provider, var lastToken: String) {
    var lastLogin: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var lastRefreshDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var numberOfRefreshs: Int = 0
}

data class Email(@Indexed val email: String, val provider: Provider) {
    val firstSeenDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var verified: Boolean = false
    var verifiedByProvider: Boolean = false
}

data class Phone(@Indexed val phoneNumber: String, val phoneType: PhoneType, val provider: Provider) {
    val firstSeenDate: LocalDateTime = LocalDateTime.now(TimeConstants.UTC_ZONE_ID)
    var verified: Boolean = false
    var verifiedByProvider: Boolean = false
}

enum class Provider {
    GOOGLE, APPLE, SELF
}

enum class PhoneType {
    MOBILE, LINE
}

enum class UserRole {
    USER, ADMIN
}