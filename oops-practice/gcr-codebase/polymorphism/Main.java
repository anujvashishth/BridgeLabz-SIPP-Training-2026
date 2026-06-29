class Vehicle {
    public double fuelCost(int km) {
        return 0;
    }
}
class Car extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 8;   // Rs. 8 per km
    }
}
class Bus extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 15;  
    }
}
class Bike extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 3;   
    }
}

class ElectricCar extends Vehicle {
    @Override
    public double fuelCost(int km) {
        return km * 2; 
    }
}

// Main class
public class Main{
    public static void main(String[] args) {

        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 10;

        for (Vehicle v : fleet) {

            System.out.println("Fuel Cost = " + v.fuelCost(km));
            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car");
            }
            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus");
            }
            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike");
            }
            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}
