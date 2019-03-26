import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Lord of Rings", "J. R. R. Tolkien", "Fantasy");
    }
    @Test
    public void haveTitle() {
        assertEquals("Lord of Rings", book.getTitle());
    }
}
