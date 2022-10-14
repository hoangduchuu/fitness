package com.developerfect.fitness.service.impl

import com.developerfect.fitness.models.BaseResponse
import com.developerfect.fitness.models.User
import com.developerfect.fitness.repositoy.UserRepository
import com.developerfect.fitness.service.IUserService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
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


    override fun create2(user: User): ResponseEntity<User> {
        if(1==1){
            throw new UneditableException("Uneditable due to can not compile source", HttpStatus.BAD_REQUEST.value());
        }
        val createdUser: User = userRepository.save(user)
        return ResponseEntity(createdUser, HttpStatus.CREATED)
    }

}