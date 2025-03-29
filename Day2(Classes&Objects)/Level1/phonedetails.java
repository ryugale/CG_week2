class mobilephone{
    String brand;
    String model;
    int price;

    mobilephone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getdetails(){
        System.out.println("The brand is: "+brand);
        System.out.println("The model is: "+model);
        System.out.println("The price is: "+price);
    }
}
public class phonedetails {
    public static void main(String[] args) {
        mobilephone phone = new mobilephone("Samsung", "AT0012", 10000);
        phone.getdetails();
    }
    
}