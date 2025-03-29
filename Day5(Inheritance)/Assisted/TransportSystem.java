class Vehicle {
    String fuelType;
    int maxSpeed;
    Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
    void displayDetails() {
        System.out.println("fuelType: " + fuelType);
        System.out.println("maxSpeed: " + maxSpeed);
    }
 }
 class Car extends Vehicle {
    int seatCapacity;
    Car(String fuelType, int maxSpeed, int seatCapacity) {
        super(fuelType, maxSpeed);
        this.seatCapacity = seatCapacity;
    }
    void displayDetails() {
        System.out.println("fuelType: " + fuelType);
        System.out.println("maxSpeed: " + maxSpeed);
        System.out.println("seatCapacity: " + seatCapacity);
    }
 }
 class Truck extends Vehicle {
    int noOfWheels;
    Truck(String fuelType, int maxSpeed, int noOfWheels) {
        super(fuelType, maxSpeed);
        this.noOfWheels = noOfWheels;
    }
    void displayDetails() {
        System.out.println("fuelType: " + fuelType);
        System.out.println("maxSpeed: " + maxSpeed);
        System.out.println("seatCapacity: " + noOfWheels);
    }
 } 
 class Motorcycle extends Vehicle {
    double fuleCapacity;
    Motorcycle(String fuelType, int maxSpeed, double fuleCapacity) {
        super(fuelType, maxSpeed);
        this.fuleCapacity = fuleCapacity;
    }
    void displayDetails() {
        System.out.println("fuelType: " + fuelType);
        System.out.println("maxSpeed: " + maxSpeed);
        System.out.println("fuleCapacity: " + fuleCapacity);
    }
 }
 class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Petrol", 180, 5);
        vehicles[1] = new Truck("Diesel", 120, 6);
        vehicles[2] = new Motorcycle("Petrol", 150, 15.5);
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
 }