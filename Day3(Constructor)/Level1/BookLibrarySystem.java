class Book {
    public String ISBN;
    protected String title;
    private String author;
 
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
 }
 class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
 }
 
 public class BookLibrarySystem {
    public static void main(String[] args) {
 
        Book book = new Book("123-456-789", "Java Programming", "John Doe");
        book.setAuthor("Jane Doe");
        System.out.println("Author: " + book.getAuthor());
        EBook ebook = new EBook("987-654-321", "Advanced Java", "Alice Smith");
        ebook.displayDetails();
    }
 }
