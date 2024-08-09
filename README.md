# Incubyte-TDD-Kata-Library-Management-System

### Simple Library Management System that allows users to perform basic operations such as adding books , returning books , and viewing available books.

## Requirements

#### Add Books:

- Users should be able to add new books to the library.
- Each book should have a unique identifier (e.g., ISBN), title, author, and publication year.

#### Borrow Books:

- Users should be able to borrow a book from the library.
- The system should ensure that the book is available before allowing it to be borrowed.
- If the book is not available, the system should raise an appropriate error .

#### Return Books:

- Users should be able to return a borrowed book.
- The system should update the availability of the book accordingly.

#### View Available Books:

- Users should be able to view a list of all available books in the library.

|       | Version |
| ----- | ------- |
| JAVA  | 19.0.2  |
| Junit | 4.13.2  |

## Compile The Classes with The Below Command

`javac -cp .;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar src\LibraryTest.java src\Book.java src\Library.java`

## Run The Test with The Below Command

`java -cp .;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore src.LibraryTest`
