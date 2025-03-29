class Book {
    static String libraryName = "Anna library";
    private String title, author;
    final String isbn;
    Book(String title, String author, String isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    }
    void displayLibraryName(){
    System.out.println("Library Name: " + libraryName);
    }
    void displayBookDetails(){
    System.out.println("ISBN: " + isbn);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    }
   
   }
   public class LibraryManagementSystem {
    public static void main(String[] args) {
    Book book1 = new Book("book1", "Author1", "1");
    System.out.println(book1 instanceof Book);
    book1.displayBookDetails();
    }
   }