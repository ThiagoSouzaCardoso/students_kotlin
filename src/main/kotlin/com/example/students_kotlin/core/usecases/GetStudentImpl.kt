package com.example.students_kotlin.core.usecases

import com.example.students_kotlin.core.model.Student
import com.example.students_kotlin.core.ports.GetStudent
import com.example.students_kotlin.core.ports.StudentsRepository
import java.util.*

class GetStudentImpl(
    private val studentsRepository: StudentsRepository) : GetStudent {

    override fun execute(id: UUID): Student = studentsRepository.findById(id);


}