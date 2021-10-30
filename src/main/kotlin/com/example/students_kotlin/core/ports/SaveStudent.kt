package com.example.students_kotlin.core.ports

import com.example.students_kotlin.core.model.Student
import java.util.UUID

interface SaveStudent {

    fun execute(student: Student) : UUID

}