package com.developerfect.fitness.controllers

import com.developerfect.fitness.models.ProductModel
import com.developerfect.fitness.repositoy.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/api/v1/Products"])
class ProductController {
//    @Autowired
//    lateinit var productRepository: ProductRepository

    @GetMapping("")
    fun getAllProducts(): List<ProductModel> {
//        return p
        return listOf(
            ProductModel(id = 1, productName = "Iphone 11", year = 2020, price = 500.0, url = ""),
            ProductModel(id = 2, productName = "Ipad 11", year = 2020, price = 500.0, url = ""),
            ProductModel(id = 3, productName = "Macbook 11", year = 2020, price = 500.0, url = "")
        )
    }
}