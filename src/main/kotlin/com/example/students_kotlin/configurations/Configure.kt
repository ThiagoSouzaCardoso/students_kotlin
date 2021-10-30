package com.example.students_kotlin.configurations

import com.example.students_kotlin.core.configurations.ConfigureUseCases
import com.example.students_kotlin.core.ports.GetStudent
import com.example.students_kotlin.core.ports.SaveStudent
import com.example.students_kotlin.core.ports.StudentsRepository
import com.example.students_kotlin.dataproviders.databases.repositories.StudentsRepositoryData
import com.example.students_kotlin.dataproviders.databases.repositories.StudentsRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configure {

    @Bean
    fun getStudents(studentsRepository: StudentsRepository) : GetStudent{
       return ConfigureUseCases().getStudent(studentsRepository)
    }

    @Bean
    fun saveStudents(studentsRepository: StudentsRepository) : SaveStudent{
        return ConfigureUseCases().saveStudent(studentsRepository)
    }

    @Bean
    fun getStudentsRepository(studentsRepositoryData: StudentsRepositoryData) : StudentsRepository{
        return StudentsRepositoryImpl(studentsRepositoryData);
    }


}