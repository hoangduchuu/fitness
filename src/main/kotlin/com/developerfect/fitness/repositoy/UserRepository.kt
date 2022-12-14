package com.developerfect.fitness.repositoy

import com.developerfect.fitness.models.ProductModel
import com.developerfect.fitness.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    fun existsByEmail(email: String): Boolean;
}