import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library();
        book = new Book("Romeo and Juliet", "Shakespere", "romance");
    }
    @Test
    public void canAddBooks() {
        this.borrower.addBook(book);
        assertEquals(1, this.borrower.privateCollectionSize());
    }
    @Test
    public void canBorrowBookFromLibrary() {
        this.library.addBooks(book);
        this.library.addBooks(book);
        this.library.addBooks(book);
        this.borrower.addBooksFromLibrary(library);
        assertEquals(1, this.borrower.privateCollectionSize());
        assertEquals(2, this.library.collectionSize());

    }
    @Test
    public void canRemoveBook() {
        this.borrower.addBook(book);
        this.borrower.removeBook();
        assertEquals(0, this.borrower.privateCollectionSize());
    }
}
