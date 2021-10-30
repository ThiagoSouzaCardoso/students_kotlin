package com.example.students_kotlin.entrypoints.rest.handles

import com.example.students_kotlin.core.exceptions.StudentNotFound
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.context.request.WebRequest
import java.time.OffsetDateTime


@ControllerAdvice
@ResponseBody
class StudentsExceptionHandler() {

    @ExceptionHandler(StudentNotFound::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleStudentsAlreadyExists(ex: StudentNotFound,request: WebRequest): ErrorMessage {
        return ErrorMessage(
            HttpStatus.NOT_FOUND,
            OffsetDateTime.now(),
            "Student Not Found",
            ex.message
        )

    }

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun internalServerErrorException(ex: Exception): ErrorMessage {

        return ErrorMessage(
            HttpStatus.INTERNAL_SERVER_ERROR,
            OffsetDateTime.now(),
            "Generic internal error",
            ex.message
        )

    }


}