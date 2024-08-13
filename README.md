# Incubyte-TDD-Kata-Library-Management-System  📚 

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

### Required Test Environment

|       | Version  📅 |
| ----- | ------- |
| JAVA ☕ | 19.0.2  |
| JUnit  🧪| 4.13.2  |

## How to set up and run the project 💻 

#### Follow The Below Steps For Set up The Project

- step : 1
  `git clone https://github.com/Divyen-Dalwadi2000/Incubyte-TDD-Kata-Library-Management-System.git`

- step : 2
  `cd Incubyte-TDD-Kata-Library-Management-System`

#### Follow The Below Steps For Run The Project

## How to Run Tests  🚀 

- To run the tests, use the following command:

- step : 1

#### Compile The Classes with The Below Command

`javac -cp .;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar src\LibraryTest.java src\Book.java src\Library.java`

- step : 2

#### Run The Test with The Below Command

`java -cp .;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore src.LibraryTest`

#### Used VS Code Extention For Run The Tests

- Test Runner for Java:
  `https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test`

# Test Report

This section provides details on the test results for the Library Management System.

### Test Summary

- **Total Tests**: 5 ✔️
- **Passed**: 5 ✅
- **Failed**: 0 ❌

### Test Results

1. **Test Add Book**

   - **Status**: Passed ✅
   - **Description**: Verifies that a book can be successfully added to the library.
   - **Details**: The book "Ruby" by Yukihiro Matsumoto was added and correctly appears in the list of available books.

2. **Test Borrow Book**

   - **Status**: Passed ✅
   - **Description**: Verifies that a book can be borrowed and removed from the available books list.
   - **Details**: The book "Ruby" by Yukihiro Matsumoto was borrowed and removed from the available books list, appearing in the borrowed books list.

3. **Test Borrow Unavailable Book**

   - **Status**: Passed ✅
   - **Description**: Verifies that attempting to borrow a book that is already borrowed throws an `IllegalStateException`.
   - **Details**: An attempt to borrow the book "Ruby" by Yukihiro Matsumoto again after it was borrowed resulted in the expected exception.

4. **Test Return Book**
   - **Status**: Passed ✅
   - **Description**: Verifies that a book can be returned to the library and is moved back to the available books list.
   - **Details**: After returning the book "Ruby" by Yukihiro Matsumoto, it was correctly moved back to the available books list and removed from the borrowed books list.

5. **Test View Available Books**
   - **Status**: Passed ✅
   - **Description**: Verifies that the available books list is updated correctly based on borrowing and returning operations.
   - **Details**: Books "Java" by Pravin Jain and "Test-Driven Development" by Kent Beck were correctly listed as available after borrowing two other books.

### Known Issues
    - None 🚫🚫
