import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in Library: " + books);
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Harry Potter");
        lib.addBook("The Alchemist");
        lib.displayBooks();
        lib.removeBook("Harry Potter");
        lib.displayBooks();
    }
}
