package com.example.students_kotlin.dataproviders.databases.repositories

import com.example.students_kotlin.dataproviders.databases.entities.StudentTable
import org.springframework.data.repository.CrudRepository
import java.util.*

interface StudentsRepositoryData : CrudRepository<StudentTable, UUID> {



}