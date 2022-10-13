package com.developerfect.fitness.service.impl

import com.developerfect.fitness.models.User
import com.developerfect.fitness.repositoy.ProductRepository
import com.developerfect.fitness.repositoy.UserRepository
import com.developerfect.fitness.service.IUserService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
@Service
@RequiredArgsConstructor
class UserService : IUserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun listAll(): List<User> {
        return userRepository.findAll();
    }

}