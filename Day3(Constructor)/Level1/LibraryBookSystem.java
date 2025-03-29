class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is not available.");
            return false;
        }
    }
    public boolean isAvailable() {
        return isAvailable;
    }
 }
 public class LibraryBookSystem {
    public static void main(String[] args) {
     
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        book1.borrowBook();
        System.out.println("Available after borrowing: " + (book1.isAvailable() ? "Yes" : "No"));
    }
 }