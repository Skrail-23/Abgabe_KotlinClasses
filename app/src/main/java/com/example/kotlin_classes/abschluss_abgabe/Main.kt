package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Create Library
    val library = Library()

    // Add Address
    val address = Library.LibraryAddress("123 Main St", "Booktown", "12345")
    address.printAddress()

    // Add Books
    library.addBook(Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("Sapiens", "Yuval Noah Harari", Genre.NON_FICTION, BookStatus.Available))
    library.addBook(Book("The Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available))
    library.addBook(Book("A People's History of the United States", "Howard Zinn", Genre.HISTORY, BookStatus.Available))
    library.addBook(Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", Genre.CHILDREN, BookStatus.Available))

    // Print Genre Descriptions
    println("Genres and their descriptions:")
    Genre.values().forEach { it.printDescription() }

    // Create Member
    val member = library.LibraryMember("Alice", "M001")

    // Checkout and Reserve Books
    val books = library.searchBooks("1984")
    if (books.isNotEmpty()) {
        member.checkoutBook(books[0], "2024-12-25")
    }

    val reservedBooks = library.searchBooks("Sapiens")
    if (reservedBooks.isNotEmpty()) {
        member.reserveBook(reservedBooks[0])
    }

    // Display Status
    library.displayBookStatuses()
}
