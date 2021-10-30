package com.example.students_kotlin.core.model

data class Student private constructor(
    val name: String?,
    val surname: String?
) {

    data class Builder(
        var name: String? = null,
        var surname: String? = null
    ) {

        fun name(name: String?) = apply { this.name = name }
        fun surname(surname: String?) = apply { this.surname = surname }
        fun build() = Student(name, surname)
    }
}