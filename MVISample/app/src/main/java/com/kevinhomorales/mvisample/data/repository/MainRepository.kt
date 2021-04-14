package com.kevinhomorales.mvisample.data.repository

import com.kevinhomorales.mvisample.data.api.RestApi

class MainRepository(private val restApi: RestApi) {
    suspend fun getTodoTasks() = restApi.getTodoTasks()
}