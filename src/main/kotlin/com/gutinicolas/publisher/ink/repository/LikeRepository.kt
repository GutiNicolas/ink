package com.gutinicolas.publisher.ink.repository

import com.gutinicolas.publisher.ink.model.api.Like
import com.gutinicolas.publisher.ink.model.api.Paper
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface LikeRepository : MongoRepository<Like, String>