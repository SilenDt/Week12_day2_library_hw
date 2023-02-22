import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();

    }


    public int bookCount() {
        return collection.size();
    }
    public ArrayList<Book> getBooks() {
        return collection;
    }

    public void addBookToLibrary(Book book) {
        if (this.bookCount() < this.capacity) {
            this.collection.add(book);
        }
    }
}
