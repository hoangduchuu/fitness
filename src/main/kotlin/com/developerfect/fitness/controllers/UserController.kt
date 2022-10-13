package com.developerfect.fitness.controllers

import com.developerfect.fitness.models.ProductModel
import com.developerfect.fitness.models.User
import com.developerfect.fitness.models.UserModel
import com.developerfect.fitness.repositoy.ProductRepository
import com.developerfect.fitness.repositoy.UserRepository
import com.developerfect.fitness.service.IUserService
import com.developerfect.fitness.service.impl.UserService
import lombok.RequiredArgsConstructor
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log

@RestController
@RequestMapping(path = ["/api/v1/users"])
class UserController {
    //
    @Autowired
    lateinit var userService: UserService
    
    val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("")
    fun getAll(): List<User> {
        return userService.listAll()
    }


}