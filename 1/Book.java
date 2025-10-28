import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> collection = new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {
        collection.add(book);
    }

    public static void removeBook(Book book) {
        collection.remove(book);
    }

    public static void displayBooks() {
        for (Book b : collection) {
            System.out.println("Title: " + b.title + ", Author: " + b.author + ", ISBN: " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", "12345");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", "67890");
        addBook(b1);
        addBook(b2);
        displayBooks();
        removeBook(b1);
        displayBooks();
    }
}
