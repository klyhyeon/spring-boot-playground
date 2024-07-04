package com.spring_boot.lab.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/lab")
class LabController(
    private val labRepository: LabRepository,
) {


    @GetMapping
    fun helloLab(): String {
        val newUser = labRepository.save(
            User(
                name = "test",
            )
        )
        println("newUser: $newUser")
        val result = labRepository.findAll()
        for (ele in result) {
            var i = 0
            println("result ${++i}: $ele")
        }
        return "Hello Lab"
    }
}