import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LibraryTest {
    //so that the functions can see these variables:
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;


    @Before
    public void before() {
        library = new Library("Eilidh's Library", 10);
        book = new Book("Title1", "Author1", "Genre1");
        book1 = new Book("Title1", "Author1", "Genre1");
        book2 = new Book("Title2", "Author2", "Genre2");
        book3 = new Book("Title3", "Author3", "Genre2");
        book4 = new Book("Title4", "Author4", "Genre1");
        library.addBookToLibrary(book);
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(1, library.bookCount());
    }
    @Test
    public void canAddBook() {
        library.addBookToLibrary(book);
        assertEquals(2, library.bookCount());
    }
}
