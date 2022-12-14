package com.developerfect.fitness.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class ProductModel(
    @Id
    @GeneratedValue
    var id: Long = 0,

    var productName: String? = null,
    var year: Int? = null,
    var price: Double? = null,
    var url: String? = null,
)