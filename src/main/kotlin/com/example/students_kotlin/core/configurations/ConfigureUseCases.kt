package com.example.students_kotlin.core.configurations

import com.example.students_kotlin.core.ports.GetStudent
import com.example.students_kotlin.core.ports.SaveStudent
import com.example.students_kotlin.core.ports.StudentsRepository
import com.example.students_kotlin.core.usecases.GetStudentImpl
import com.example.students_kotlin.core.usecases.SaveStudentImpl

class ConfigureUseCases{

    fun getStudent(studentsRepository: StudentsRepository) : GetStudent = GetStudentImpl(studentsRepository)
    fun saveStudent(studentsRepository: StudentsRepository) : SaveStudent = SaveStudentImpl(studentsRepository)




}