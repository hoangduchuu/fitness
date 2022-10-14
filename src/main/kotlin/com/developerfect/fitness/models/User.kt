package com.developerfect.fitness.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import org.hibernate.annotations.Table
import org.jetbrains.annotations.NotNull
import java.util.Date
@Entity(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    var id: Long? = null

    @Column
    var createdAt: Date? = null

    @Column
    var updatedAt: Date? = null

    @Column
    var deletedAt: Date? = null

    @Column
    @NotNull(value = "Khong bao gio dc null")
    @NotEmpty(message = "The name là bắt buộc.")
    var name: String? = null

    @Column
    @Email(message = "Phai la email")
    @NotEmpty(message = "The email address is required.")
    var email: String? = null

    @Column
    var role: String? = null

    @Column
    var age: Int? = null

    @Column
    var password: String? = null

    @Column
    var token: String? = null

}