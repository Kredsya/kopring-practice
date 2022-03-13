package com.example.blog

import BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args)
}

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication {
    // ...
}