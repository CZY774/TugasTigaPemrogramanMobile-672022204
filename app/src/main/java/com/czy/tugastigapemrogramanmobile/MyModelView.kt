package com.czy.tugastigapemrogramanmobile

// MyViewModel.kt
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    var users by mutableStateOf<List<User>>(emptyList())
        private set

    var products by mutableStateOf<List<Product>>(emptyList())
        private set

    var isLoadingUsers by mutableStateOf(false)
        private set

    var isLoadingProducts by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    fun getUsers() {
        viewModelScope.launch {
            isLoadingUsers = true
            errorMessage = null
            try {
                val response = RetrofitInstance.api.getUsers()
                if (response.isSuccessful) {
                    users = response.body()?.users ?: emptyList()
                } else {
                    errorMessage = "Error: ${response.code()}"
                }
            } catch (e: Exception) {
                errorMessage = "Network error: ${e.message}"
            } finally {
                isLoadingUsers = false
            }
        }
    }

    fun getProducts() {
        viewModelScope.launch {
            isLoadingProducts = true
            errorMessage = null
            try {
                val response = RetrofitInstance.api.getProducts()
                if (response.isSuccessful) {
                    products = response.body()?.products ?: emptyList()
                } else {
                    errorMessage = "Error: ${response.code()}"
                }
            } catch (e: Exception) {
                errorMessage = "Network error: ${e.message}"
            } finally {
                isLoadingProducts = false
            }
        }
    }

    fun clearError() {
        errorMessage = null
    }
}