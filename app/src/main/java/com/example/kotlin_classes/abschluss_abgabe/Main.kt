package com.example.kotlin_classes.abschluss_abgabe

fun main() {
    // Create Library
    val library = Library()

    println("====================================")
    println("          Welcome to the Library          ")
    println("====================================\n")

    // Add Address
    val address = Library.LibraryAddress("123 Main St", "Booktown", "12345")
    println("Library Details:")
    address.printAddress()
    println("------------------------------------\n")

    // Add Books
    println("Adding books to the library...")
    library.addBook(Book("1984", "George Orwell", Genre.FICTION, BookStatus.Available))
    library.addBook(Book("Sapiens", "Yuval Noah Harari", Genre.NON_FICTION, BookStatus.Available))
    library.addBook(Book("The Brief History of Time", "Stephen Hawking", Genre.SCIENCE, BookStatus.Available))
    library.addBook(Book("A People's History of the United States", "Howard Zinn", Genre.HISTORY, BookStatus.Available))
    library.addBook(Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", Genre.CHILDREN, BookStatus.Available))
    println("------------------------------------\n")

    // Print Genre Descriptions
    println("Genres and Their Descriptions:")
    Genre.FICTION.printAllDescriptions()


    println("------------------------------------\n")

    // Create Member
    val member = library.LibraryMember("Alice", "M001")
    println("Library Member Created:")
    println("Name: ${member.name}, Member ID: ${member.memberID}")
    println("------------------------------------\n")

    // Checkout and Reserve Books
    println("Searching and checking out books...")
    val books = library.searchBooks("1984")
    if (books.isNotEmpty()) {
        member.checkoutBook(books[0], "2024-12-25")
    } else {
        println("No books found for '1984'")
    }
    println("------------------------------------\n")

    println("Searching and reserving books...")
    val reservedBooks = library.searchBooks("Sapiens")
    if (reservedBooks.isNotEmpty()) {
        member.reserveBook(reservedBooks[0])
    } else {
        println("No books found for 'Sapiens'")
    }
    println("------------------------------------\n")

    // Display Status
    println("Current Status of All Books in the Library:")
    library.displayBookStatuses()
    println("\n====================================")
    println("        Thank You for Visiting       ")
    println("====================================")
}
