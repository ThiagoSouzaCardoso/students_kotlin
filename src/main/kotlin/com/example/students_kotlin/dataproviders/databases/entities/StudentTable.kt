package com.example.students_kotlin.dataproviders.databases.entities

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class StudentTable private constructor(
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)", unique = true)
    var id: UUID?,
    var name: String?,
    var surname: String?
  ){

    data class Builder(
        var id: UUID? = null,
        var name: String? = null,
        var surname: String? = null) {

        fun id(id: UUID) = apply { this.id = id }
        fun name(name: String?) = apply { this.name = name }
        fun surname(surname: String?) = apply { this.surname = surname }

        fun build() = StudentTable(id, name, surname)
    }



}
