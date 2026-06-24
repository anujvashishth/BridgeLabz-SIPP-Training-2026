// Parent Class
class Package {
    private String trackingId;
    private double weight;

    // Constructor
    public Package(String trackingId, double weight) {
        this.trackingId = trackingId;

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than 0.");
            this.weight = 1.0; // default value
        }
    }

    // Getters
    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    // Setter with validation
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than 0.");
        }
    }
}

// Child Class
class ExpressPackage extends Package {
    private String priorityLevel;

    // Constructor
    public ExpressPackage(String trackingId, double weight, String priorityLevel) {
        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    // Getter
    public String getPriorityLevel() {
        return priorityLevel;
    }

    // Method to print shipping label
    public void printShippingLabel() {
        System.out.println("----- Shipping Label -----");
        System.out.println("Tracking ID   : " + getTrackingId());
        System.out.println("Weight        : " + getWeight() + " kg");
        System.out.println("Priority Level: " + priorityLevel);
        System.out.println("--------------------------");
    }
}

// Main Class
public class Tracking{
    public static void main(String[] args) {

        // Scenario A: Valid Input
        ExpressPackage pkg =
                new ExpressPackage("EXP101", 2.5, "Critical");

        pkg.printShippingLabel();

        System.out.println();

        // Scenario B: Invalid Weight
        pkg.setWeight(-1.5);
        pkg.setWeight(0.0);

        System.out.println("\nWeight after invalid updates: "
                + pkg.getWeight() + " kg");
    }
}
