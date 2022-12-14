package com.developerfect.fitness.repositoy

import com.developerfect.fitness.models.ProductModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductModel, Long> {

}