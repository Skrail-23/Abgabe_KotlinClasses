package com.example.kotlin_classes.abschluss_abgabe

sealed class BookStatus {
    object Available : BookStatus() {
        override fun getDescription() = "The book is available."
    }

    data class CheckedOut(val dueDate: String) : BookStatus() {
        override fun getDescription() = "The book is checked out, due back on $dueDate."
    }

    data class Reserved(val reservedBy: String) : BookStatus() {
        override fun getDescription() = "The book is reserved by $reservedBy."
    }

    abstract fun getDescription(): String
}
