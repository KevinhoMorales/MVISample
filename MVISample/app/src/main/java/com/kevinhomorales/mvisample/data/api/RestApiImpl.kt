package com.kevinhomorales.mvisample.data.api

import com.kevinhomorales.mvisample.data.model.TodoTask

class RestApiImpl(private val restApiService: RestApiService): RestApi {

    override suspend fun getTodoTasks(): List<TodoTask> {
        return restApiService.listTodo()
    }
}