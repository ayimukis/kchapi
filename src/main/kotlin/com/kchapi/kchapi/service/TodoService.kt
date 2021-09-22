package com.kchapi.kchapi.service


import com.kchapi.kchapi.repository.Todo
import com.kchapi.kchapi.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {
    fun getTodos() = todoRepository.findAll()

    fun insertTodo(todoName: String, todoContent: String): Todo = todoRepository.save(Todo(todoName = todoName,todoContent = todoContent))

    fun updateTodo(todoId: Long): Todo {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.completed = !todo.completed
        return todoRepository.save(todo)
    }

    fun updateTodo2(todoId: Long, todoContent: String): Todo {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.todoContent = todoContent
        return todoRepository.save(todo)
    }

    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}