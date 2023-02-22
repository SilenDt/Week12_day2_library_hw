public class Book {
    //declare variables here (because of block scoping) so they can be seen in other functions
    //make space in memory for these strings:
    //private means it can only be accessed in the class
    //if it was public we could directly access it from another file (ex. book.title = "something different")

    //INSTANCE VARIABLES:
        private String title;
        private String author;
        private String genre;


    //CONSTRUCTOR FUNCTION:
    public Book(String title, String author, String genre) {
            this.title = title;
            this.author = author;
            this.genre = genre;
        }

        //GETTERS AND SETTERS
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getGenre() {
        return this.genre;
    }
}
