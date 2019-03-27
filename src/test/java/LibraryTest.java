import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Library library;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Lord of Rings", "J. R. R. Tolkien", "fantasy");
        book2 = new Book("The Hunger Games", "Suzanne Collins", "fantasy");
        book3 = new Book("Twilight", "Stephanie Meyers", "fantasy");
        borrower = new Borrower();
    }
    @Test
    public void canAddBooksToCollection() {
        for (int i=0; i<3; i++) {
            library.addBooks(book1);}
        assertEquals(3, this.library.collectionSize());
        library.addBooks(book1);
        library.addBooks(book1);
        library.addBooks(book1);
        assertEquals(5, this.library.collectionSize());
    }
    @Test
    public void canRemoveBooksFromCollection() {
        for (int i=0; i<5; i++) {
            library.addBooks(book1);
        }
        this.library.removeBook();
        this.library.removeBook();
        assertEquals(3, this.library.collectionSize());
    }
    @Test
    public void canAddReadBooks() {
        borrower.addBook(book1);
        this.library.addReadBook(borrower);
        assertEquals(1, this.library.collectionSize());
        assertEquals(0, this.borrower.privateCollectionSize());

    }
}
