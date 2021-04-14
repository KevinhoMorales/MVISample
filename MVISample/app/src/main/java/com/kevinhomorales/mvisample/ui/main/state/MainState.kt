package com.kevinhomorales.mvisample.ui.main.state

import com.kevinhomorales.mvisample.data.model.TodoTask

sealed class MainState {
    object Idle: MainState()
    object Loading: MainState()
    data class LoadTasks(val todoTasks: List<TodoTask>): MainState()
    data class Error(val error: String?): MainState()
}