package com.czy.tugastigapemrogramanmobile

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val image: String,
    val address: Address,
    val company: Company,
    val university: String
)

data class Address(
    val address: String,
    val city: String,
    val state: String,
    val country: String,
    val postalCode: String
)

data class Company(
    val name: String,
    val department: String,
    val title: String
)

data class UserResponse(
    val users: List<User>,
    val total: Int,
    val skip: Int,
    val limit: Int
)