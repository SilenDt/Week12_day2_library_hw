import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {
    Library library;

    Book book;
    Book book1;
    Book book2;
    Book book3;
    Book book4;


    @Before
    public void setUp() {
        int capacity;
        library = new Library("Eilidh's Library", capacity = 10);
        book = new Book();
        book1 = new Book();
        book2 = new Book();
        book3 = new Book();
        book4 = new Book();
        library.addBookToLibrary(book);
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, library.bookCount());
    }
    @Test
    public void canAddBook() {
        library.addBookToLibrary(book);
        assertEquals(1, library.bookCount());
    }

}
