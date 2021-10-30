package com.example.students_kotlin.entrypoints.rest

import com.example.students_kotlin.core.model.Student
import com.example.students_kotlin.core.ports.GetStudent
import com.example.students_kotlin.core.ports.SaveStudent
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/students")
class StudentsController(
    private var saveStudent: SaveStudent,
    private var getStudent: GetStudent) {

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun findStudent(@PathVariable("id") id: UUID) = getStudent.execute(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveStudent(@RequestBody studentSaveIn: StudentSaveIn) : UUID {
        var student =  Student.Builder().name(studentSaveIn.name).surname(studentSaveIn.surname).build()
        return saveStudent.execute(student)
    }
}