package com.developerfect.fitness.service

import com.developerfect.fitness.models.BaseResponse
import com.developerfect.fitness.models.User
import org.springframework.http.ResponseEntity

interface IUserService {
    fun listAll(): List<User>

    fun create2(user: User): ResponseEntity<User>
}