package com.developerfect.fitness.models


data class UserModel(
    var id: Long = 0,
    var productName: String? = null,
    var year: Int? = null,
    var price: Double? = null,
    var url: String? = null,
)