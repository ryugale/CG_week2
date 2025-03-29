class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    static final int perDayCost = 1000;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
 
    void getRentailDetails(){
        System.out.println("Customer name: "+ customerName);
        System.out.println("Car Model: "+ carModel);
        System.out.println("Rental days: "+ rentalDays);
    }
 
    void getTotalCost(){
        System.out.println("Total cose: " + rentalDays * perDayCost);
    }
 }
 
 public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental customer1 = new CarRental("bob", "XUV 500", 3);
        customer1.getRentailDetails();
        customer1.getTotalCost();
    }
 }