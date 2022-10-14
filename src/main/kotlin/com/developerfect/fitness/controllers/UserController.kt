package com.developerfect.fitness.controllers

import com.developerfect.fitness.models.BaseResponse
import com.developerfect.fitness.models.User
import com.developerfect.fitness.service.impl.UserService
import jakarta.validation.Valid
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/api/v1/users"])
class UserController {
    //
    @Autowired
    lateinit var userService: UserService

    val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("")
    fun getAll(): List<User> = userService.listAll()

    @PostMapping("")
    fun newUser2(@Valid @RequestBody newEmployee: User?): ResponseEntity<User>? = newEmployee?.let { userService.create2(it) }
}