package com.example.students_kotlin.core.ports

import com.example.students_kotlin.core.model.Student
import java.util.UUID

interface StudentsRepository {

    fun findById(id: UUID): Student
    fun save(student: Student) : UUID

}