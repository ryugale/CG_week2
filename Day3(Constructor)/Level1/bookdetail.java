class books{
    String title, author;
    int price;

    books(){
        title = "Lion King";
        author = "vijay";
        price = 100;
    }

    books(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void getdetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class bookdetail {
    public static void main(String[] args) {
        books book1 = new books();
        book1.getdetails();
        books book2 = new books("Percy Jaackson", "Alex", 10000);
        book2.getdetails();
    }
}