package com.kchapi.kchapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KchapiApplication

fun main(args: Array<String>) {
	runApplication<KchapiApplication>(*args)
}
