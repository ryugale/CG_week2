class Product{
    static int totalproduct = 0;
    String productname;
    int price;

    Product(String productname, int price){
        this.productname = productname;
        this.price = price;
        totalproduct += 1;
    }

    void displayProductDetails(){
        System.out.println("The product name is "+productname);
        System.out.println("The product price is "+price);
    }
    static int displayTotalProducts(){
        System.out.println("The total number of products is "+totalproduct);
        return totalproduct;
    }

}

public class ProductInventory {
    public static void main(String[] args) {
        Product product = new Product("bottle",1000);
        product.displayProductDetails();
        product.displayTotalProducts();
    }
}