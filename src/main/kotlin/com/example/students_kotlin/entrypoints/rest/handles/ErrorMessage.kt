package com.example.students_kotlin.entrypoints.rest.handles

import org.springframework.http.HttpStatus
import java.time.OffsetDateTime

data class ErrorMessage(
    val status: HttpStatus,
    val time: OffsetDateTime,
    val message: String,
    val details: String?
)