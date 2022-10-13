package com.developerfect.fitness.service

import com.developerfect.fitness.models.User

interface IUserService {
    fun listAll(): List<User>
}