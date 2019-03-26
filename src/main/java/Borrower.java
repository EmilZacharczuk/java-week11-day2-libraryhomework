import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> privateCollection;

    public Borrower() {
        privateCollection = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.privateCollection.add(book);
    }

    public int privateCollectionSize() {
        return this.privateCollection.size();
    }

    public void addBooksFromLibrary(Library library) {
        Book newBook = library.removeBook();
        addBook(newBook);
    }
}
