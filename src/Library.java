package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    private Map<String, Book> books = new HashMap<>();
    private Set<Book> borrowedBooks = new HashSet<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Set<Book> getAvailableBooks() {
        Set<Book> availableBooks = new HashSet<>(books.values());
        availableBooks.removeAll(borrowedBooks);
        return availableBooks;
    }

    public void borrowBook(String isbn) {
        Book book = books.get(isbn);
        borrowedBooks.add(book);
    }

    public Set<Book> getBorrowedBooks() {
        return new HashSet<>(borrowedBooks);
    }
}
