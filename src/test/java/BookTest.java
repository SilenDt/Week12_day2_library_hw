import org.junit.Before;

public class BookTest {
    private Book book;

    @Before
    public void before() {
        book = new Book("Girl On The Train", "Paula Hawkins", "Psychological Thriller");
    }
}
