import java.util.*;
public class MobileData {
    public static double calculateBill(double usage) {
        if (usage < 5) {
            return usage * 100;
        } else if (usage <= 20) {
            return usage * 80;
        } else {
            return usage * 60;
        }
    }

    // Function to get plan category
    public static String getPlanCategory(double usage) {
        if (usage < 5) {
            return "Less than 5 GB Plan";
        } else if (usage <= 20) {
            return "5-20 GB Plan";
        } else {
            return "More than 20 GB Plan";
        }
    }

    // Function to calculate total revenue
    public static double calculateRevenue(double[] usages) {
        double revenue = 0;

        for (double usage : usages) {
            revenue += calculateBill(usage);
        }

        return revenue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single customer
        System.out.print("Enter data usage (GB): ");
        double usage = sc.nextDouble();

        System.out.println("Plan Category: " + getPlanCategory(usage));
        System.out.println("Total Bill: ₹" + calculateBill(usage));

        // Array of 10 customers
        double[] customers = {3, 7, 12, 25, 4, 18, 22, 6, 30, 15};

        System.out.println("Total Revenue Collected: ₹" +
                calculateRevenue(customers));
    }
}
