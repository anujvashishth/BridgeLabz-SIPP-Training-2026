import java.util.Scanner;

public class StringCharacters {

    // User-defined method to return characters of a string
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // User-defined method
        char[] userArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Display user-defined array
        System.out.print("Characters using user-defined method: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Display built-in array
        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Compare arrays
        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("Are both arrays equal? " + result);

        
    }
}
