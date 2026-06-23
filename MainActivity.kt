package com.example.taskmanager

class MainActivity {

    private val repository = TaskRepository()

    fun loadTasks() {
        println(repository.getTasks())
    }
}
