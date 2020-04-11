package com.learn.at.home.kotlinstarter.controller

import com.learn.at.home.kotlinstarter.model.Greeting
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HelloWorldController {

    var id = AtomicLong()

    @GetMapping("/startKotlin")
    fun getHelloWorld(@RequestParam(value = "name",defaultValue = "summers edge") name : String): Greeting {
        return Greeting(id.incrementAndGet(),"Hello $name")
    }
}