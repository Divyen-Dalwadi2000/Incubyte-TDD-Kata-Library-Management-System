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
        if (book == null || borrowedBooks.contains(book)) {
            throw new IllegalStateException("Book is not available.");
        }
        borrowedBooks.add(book);
    }

    public Set<Book> getBorrowedBooks() {
        return new HashSet<>(borrowedBooks);
    }

    public void returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book == null || !borrowedBooks.contains(book)) {
            throw new IllegalStateException("Book was not borrowed.");
        }
        borrowedBooks.remove(book);
    }
}
