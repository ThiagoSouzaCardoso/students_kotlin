package com.example.students_kotlin.dataproviders.databases.repositories

import com.example.students_kotlin.core.exceptions.StudentNotFound
import com.example.students_kotlin.core.model.Student
import com.example.students_kotlin.core.ports.StudentsRepository
import com.example.students_kotlin.dataproviders.databases.entities.StudentTable
import java.util.UUID

class StudentsRepositoryImpl(private val studentsRepositoryData: StudentsRepositoryData) : StudentsRepository {

    override fun findById(id: UUID): Student {
        val studentFound = studentsRepositoryData.findById(id).orElseThrow{StudentNotFound("Student Not Found")}
        return Student.Builder()
            .name(studentFound.name)
            .surname(studentFound.surname).build()
    }

    override fun save(student: Student): UUID {
        val studentData = StudentTable.Builder().name(student.name).surname(student.surname).build()
        studentsRepositoryData.save(studentData)
        return studentData.id ?: throw IllegalArgumentException("Error to save Student")
    }
}