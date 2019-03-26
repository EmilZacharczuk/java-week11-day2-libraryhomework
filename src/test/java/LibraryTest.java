import org.junit.Before;

public class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Library library;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Lord of Rings", "J. R. R. Tolkien", "fantasy");
        book2 = new Book("The Hunger Games", "Suzanne Collins", "fantasy");
        book3 = new Book("Twilight", "Stephanie Meyers", "fantasy");
    }
    
}
