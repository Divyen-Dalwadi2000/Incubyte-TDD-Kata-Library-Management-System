package src;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("81-203-1234-5", "Ruby", "Yukihiro Matsumoto", 2008);
        library.addBook(book);
        assertTrue(library.getAvailableBooks().contains(book));
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("81-203-1234-5", "Ruby", "Yukihiro Matsumoto", 2008);
        library.addBook(book);
        library.borrowBook("81-203-1234-5");
        assertTrue(library.getBorrowedBooks().contains(book));
        assertFalse(library.getAvailableBooks().contains(book));
    }

    @Test
    public void testBorrowUnavailableBook() {
        Book book = new Book("81-203-1234-5", "Ruby", "Yukihiro Matsumoto", 2008);
        library.addBook(book);
        library.borrowBook("81-203-1234-5");
        assertThrows(IllegalStateException.class, () -> library.borrowBook("81-203-1234-5"));
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("81-203-1234-5", "Ruby", "Yukihiro Matsumoto", 2008);
        library.addBook(book);
        library.borrowBook("81-203-1234-5");
        library.returnBook("81-203-1234-5");
        assertTrue(library.getAvailableBooks().contains(book));
    }
}
