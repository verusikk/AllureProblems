package com.azul.testing

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TestingApplication {
    fun main(args: Array<String>) {
        SpringApplication.run(TestingApplication::class.java, *args)
    }
}