package com.kchapi.kchapi.controller

import com.kchapi.kchapi.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController(
    private val todoService: TodoService
) {

    @GetMapping
    fun getTodos() = todoService.getTodos()

    @PostMapping
    fun insertTodo(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.todoName,todoRequest.todoContent)

    @PutMapping(path = ["/{todoId}"])
    fun updateTodo(@PathVariable(value = "todoId") todoId: Long) = todoService.updateTodo(todoId)

    @DeleteMapping(path = ["/{todoId}"])
    fun deleteTodo(@PathVariable(value = "todoId") todoId: Long) = todoService.deleteTodo(todoId)

}