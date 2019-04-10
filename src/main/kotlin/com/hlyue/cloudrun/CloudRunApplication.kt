package com.hlyue.cloudrun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.*
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class CloudRunApplication

fun main(args: Array<String>) {
	runApplication<CloudRunApplication>(*args)
}

@Controller
class C {

	data class D(
		val hello: String
	)

	@GetMapping("/hello/{hello}")
	@ResponseBody
	fun hello(@PathVariable hello: String): D {
		return D("world $hello")
	}
}