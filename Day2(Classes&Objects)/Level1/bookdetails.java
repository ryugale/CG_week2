class books{
    String title;
    String author;
    int price;

    books(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getdetail(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

public class bookdetails {
    public static void main(String[] args) {
        books book = new books("Percy Jackson", "me", 1000);
        book.getdetail();
    }    
}