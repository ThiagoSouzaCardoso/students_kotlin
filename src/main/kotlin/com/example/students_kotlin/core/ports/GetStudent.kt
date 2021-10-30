package com.example.students_kotlin.core.ports

import com.example.students_kotlin.core.model.Student
import java.util.*

interface GetStudent {
    fun execute(id: UUID): Student
}