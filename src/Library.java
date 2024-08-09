package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public Set<Book> getAvailableBooks() {
        Set<Book> availableBooks = new HashSet<>(books.values());
        return availableBooks;
    }
}
