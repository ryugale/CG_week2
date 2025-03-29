interface Refuelable {

    void refuel();
}
class Vehicle {
    double maxSpeed;
    String model;
    Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println("Charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(double maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println("Refuling");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ola = new ElectricVehicle(120, "E120");
        PetrolVehicle ninja = new PetrolVehicle(300, "Z900");
        ola.charge();
        ninja.refuel();
    }
}