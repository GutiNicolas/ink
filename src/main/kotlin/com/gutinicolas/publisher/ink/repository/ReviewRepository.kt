package com.gutinicolas.publisher.ink.repository

import com.gutinicolas.publisher.ink.model.api.Paper
import com.gutinicolas.publisher.ink.model.api.Review
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : MongoRepository<Review, String>