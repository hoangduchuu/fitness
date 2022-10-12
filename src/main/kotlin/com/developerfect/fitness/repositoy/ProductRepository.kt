package com.developerfect.fitness.repositoy

import com.developerfect.fitness.models.ProductModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<ProductModel, Long> {

}