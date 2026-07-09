interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    int maxSpeed;
    String model;

    // Constructor
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass
class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

// Subclass implementing interface
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

public class vehicle {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(220, "Toyota Fortuner");

        System.out.println("Electric Vehicle");
        ev.displayInfo();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");
        pv.displayInfo();
        pv.refuel();
     
    }
}
