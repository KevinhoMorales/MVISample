package com.kevinhomorales.mvisample.data.api

import com.kevinhomorales.mvisample.data.model.TodoTask
import retrofit2.http.GET

interface RestApiService {

    @GET("todos")
    suspend fun listTodo(): List<TodoTask>

}