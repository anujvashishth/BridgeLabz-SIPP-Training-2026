class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.0; // ₹8 per unit

    // Instance Variables
    String stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display station details
    void displayStationDetails() {
        System.out.println("Station ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Rate per Unit   : ₹" + electricityRate);
        System.out.println("Bill Amount     : ₹" + calculateBill());
        System.out.println("--------");
    }
}

public class EVChargingNetwork {
    public static void main(String[] args) {

        // Create 5 charging stations
        ChargingStation s1 = new ChargingStation("CS101", 120);
        ChargingStation s2 = new ChargingStation("CS102", 150);
        ChargingStation s3 = new ChargingStation("CS103", 200);
        ChargingStation s4 = new ChargingStation("CS104", 175);
        ChargingStation s5 = new ChargingStation("CS105", 250);

        System.out.println("Bills at Initial Rate (₹8/unit)\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("\nAfter Rate Change (₹10/unit)\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations Created: "
                           + ChargingStation.totalStations);
    }
}
