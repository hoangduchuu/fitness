//package com.developerfect.fitness.database
//
//import com.developerfect.fitness.models.ProductModel
//import com.developerfect.fitness.repositoy.ProductRepository
//import com.developerfect.fitness.repositoy.UserRepository
//import com.developerfect.fitness.service.IUserService
//import org.slf4j.LoggerFactory
//import org.springframework.boot.CommandLineRunner
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import java.util.logging.Logger
//
//@Configuration
//class Database {
//    private val logger = LoggerFactory.getLogger(this::class.java)
//
//    @Bean
//    fun initDatabase(product: ProductRepository, userRepository: UserRepository,userService: IUserService): CommandLineRunner {
//        return CommandLineRunner {
//            val product1 = ProductModel(id = 0, productName = "Iphone 11", year = 2020, price = 500.0, url = "a")
//            val product2 = ProductModel(productName = "Ipad 11", year = 2020, price = 500.0, url = "")
//            val product3 = ProductModel(productName = "Macbook 11", year = 2020, price = 500.0, url = "")
//            product.save(product1)
//            product.save(product2)
//            product.save(product3)
//        }
//    }
//}