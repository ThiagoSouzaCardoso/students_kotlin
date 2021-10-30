package com.example.students_kotlin.core.usecases

import com.example.students_kotlin.core.model.Student
import com.example.students_kotlin.core.ports.SaveStudent
import com.example.students_kotlin.core.ports.StudentsRepository
import java.util.*

class SaveStudentImpl(
    private val studentsRepository: StudentsRepository) : SaveStudent {

    override fun execute(student: Student): UUID = studentsRepository.save(student)



}