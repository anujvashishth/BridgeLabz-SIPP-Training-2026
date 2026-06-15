import java.util.Scanner;

public class StringLengthWithoutLength {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // Access character at index count
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLength = findLength(str);

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + str.length());

        
    }
}