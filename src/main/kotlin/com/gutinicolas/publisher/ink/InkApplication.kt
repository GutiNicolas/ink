package com.gutinicolas.publisher.ink

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InkApplication

fun main(args: Array<String>) {
	runApplication<InkApplication>(*args)
}
