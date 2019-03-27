import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int copacity;

    public Library() {
        this.collection = new ArrayList<>();
        this.copacity = 5;
    }

    public int collectionSize() {
        return this.collection.size();
    }

    public void addBooks(Book book) {
        if (collectionSize() < this.copacity) {
            this.collection.add(book);
        }
    }
    public Book removeBook() {
        return this.collection.remove(0);
    }

    public void addReadBook(Borrower borrower) {
        Book readBook = borrower.removeBook();
        this.collection.add(readBook);
    }

}
