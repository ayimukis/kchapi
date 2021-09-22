package com.kchapi.kchapi.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

@Entity
class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var todoId: Long? = null,

    @Column(nullable = false)
    @ColumnDefault(value = "false")
    var completed: Boolean = false,

    @Column(nullable = false)
    var todoName: String,

    @Column(nullable = false)
    @ColumnDefault(value = "")
    var todoContent: String
)