package com.developerfect.fitness.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
data class ProductModel(
    @Id
    @GeneratedValue
    private var id: Long = 0,

    private var productName: String? = null,
    private var year: Int? = null,
    private  var price: Double? = null,
    private  var url: String? = null,
)