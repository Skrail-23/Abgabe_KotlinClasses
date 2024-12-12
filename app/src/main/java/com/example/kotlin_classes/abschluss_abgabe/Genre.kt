package com.example.kotlin_classes.abschluss_abgabe

enum class Genre(val description: String) {
    FICTION("Fictional stories and novels"),
    NON_FICTION("Non-fictional works"),
    SCIENCE("Scientific literature"),
    HISTORY("Historical accounts"),
    CHILDREN("Books for children");

    fun printDescription() {
        println(description)
    }
}
