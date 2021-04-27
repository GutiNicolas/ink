package com.gutinicolas.publisher.ink.services

import com.gutinicolas.publisher.ink.model.api.Paper
import com.gutinicolas.publisher.ink.repository.PaperRepository
import org.springframework.stereotype.Service

@Service
class PublisherService(private val paperRepository: PaperRepository) {

    fun createPaper(title: String, creator: String, body: String, description: String) : Paper {
        val paper = Paper("Titulo", "Nicolas", "Body del Post", "Un post de prueba")
        return paper
    }

    fun find(id: String) : Paper? {
        return paperRepository.findById(id).orElse(null)
    }
}