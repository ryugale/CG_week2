class Product {
    static double discount = 0.0;
    final String productID;
    private String productName;
    private double price;
    private int quantity;
    Product(String productID, String productName, double price, int
   quantity) {
    this.productID = productID;
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    }
    static void updateDiscount(double newDiscount) {
    discount = newDiscount;
    }
    void displayProductDetails() {
    System.out.println("Product ID: " + productID);
    System.out.println("Product Name: " + productName);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Discount: " + discount + "%");
    }
   }
   public class ShoppingCartSystem {
    public static void main(String[] args) {
    Product product1 = new Product("P001", "Laptop", 75000, 2);
    if (product1 instanceof Product) {
    product1.displayProductDetails();
    }
    Product.updateDiscount(10.0);
    if (product1 instanceof Product) {
    product1.displayProductDetails();
    }
    }
   }