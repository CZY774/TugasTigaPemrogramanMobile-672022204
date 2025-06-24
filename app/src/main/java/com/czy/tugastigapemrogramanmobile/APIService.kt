package com.czy.tugastigapemrogramanmobile

import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET("users")
    suspend fun getUsers(): Response<UserResponse>

    @GET("products")
    suspend fun getProducts(): Response<ProductResponse>
}