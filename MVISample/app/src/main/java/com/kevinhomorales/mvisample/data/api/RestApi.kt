package com.kevinhomorales.mvisample.data.api

import com.kevinhomorales.mvisample.data.model.TodoTask

interface RestApi {
    suspend fun getTodoTasks(): List<TodoTask>
}