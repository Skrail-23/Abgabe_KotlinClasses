package com.example.kotlin_classes.abschluss_abgabe

class Library {
    private val books = mutableListOf<Book>()

    // Nested Class
    class LibraryAddress(val street: String, val city: String, val zipCode: String) {
        fun printAddress() {
            println("Library Address: $street, $city, $zipCode")
        }
    }

    // Inner Class
    inner class LibraryMember(val name: String, val memberID: String) {
        fun checkoutBook(book: Book, dueDate: String) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.CheckedOut(dueDate)
                println("$name checked out '${book.title}'.")
            } else {
                println("Cannot checkout '${book.title}'. Current status: ${book.status.getDescription()}")
            }
        }

        fun reserveBook(book: Book) {
            if (book.status is BookStatus.Available) {
                book.status = BookStatus.Reserved(name)
                println("$name reserved '${book.title}'.")
            } else {
                println("Cannot reserve '${book.title}'. Current status: ${book.status.getDescription()}")
            }
        }
    }

    fun addBook(book: Book) {
        books.add(book)
        println("Added book: ${book.title} by ${book.author}")
    }

    fun searchBooks(keyword: String): List<Book> {
        return books.filter { it.title.contains(keyword, ignoreCase = true) || it.author.contains(keyword, ignoreCase = true) }
    }

    fun displayBookStatuses() {
        books.forEach { book ->
            println("- Title: ${book.title}\n  Status: ${book.status.getDescription()}")
        }
    }
}
