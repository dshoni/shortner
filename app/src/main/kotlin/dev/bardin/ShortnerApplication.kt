package dev.bardin.shortner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShortnerApplication

fun main(args: Array<String>) {
	runApplication<ShortnerApplication>(*args)
}
