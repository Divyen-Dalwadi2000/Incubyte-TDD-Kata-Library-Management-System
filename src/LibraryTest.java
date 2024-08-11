package src;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
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
        assertFalse(library.getBorrowedBooks().contains(book));
    }

    @Test
    public void testViewAvailableBooks() {
        Book book1 = new Book("81-203-1234-5", "Ruby", "Yukihiro Matsumoto", 2008);
        Book book2 = new Book("81-203-1234-6", "Java", "Pravin Jain", 2010);
        Book book3 = new Book("81-203-1234-7", "React", "Alex Banks", 2020);
        Book book4 = new Book("81-203-1234-8", "Test-Driven Development", "Kent Beck", 2000);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.borrowBook("81-203-1234-5");
        library.borrowBook("81-203-1234-7");
        assertEquals(2, library.getAvailableBooks().size());

        assertTrue(library.getAvailableBooks().contains(book2));
        assertTrue(library.getAvailableBooks().contains(book4));
    }
}
