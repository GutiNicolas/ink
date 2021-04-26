package com.gutinicolas.publisher.ink.model.api

data class Interaction (val id: String) {
    var likes: List<Like> = ArrayList()
    var comments: List<Comment> = ArrayList()
}