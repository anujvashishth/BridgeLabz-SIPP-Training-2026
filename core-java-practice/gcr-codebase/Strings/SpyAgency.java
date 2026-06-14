import java.util.*;

public class SpyAgency {

    // Reverse a message
    public static String reverseMessage(String msg) {
        return new StringBuilder(msg).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String msg) {
        String reversed = reverseMessage(msg);
        return msg.equalsIgnoreCase(reversed);
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String msg) {
        int vowels = 0, consonants = 0;

        for (char ch : msg.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check anagram
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // First non-repeating character
    public static Character firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));
        System.out.println("Palindrome: " + isPalindrome(message));

        countVowelsAndConsonants(message);

        // Anagram check
        System.out.print("Enter first intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String intercept2 = sc.nextLine();

        System.out.println("Are Anagrams: " +
                areAnagrams(intercept1, intercept2));

        // First non-repeating character
        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        Character result = firstNonRepeating(log);

        if (result != null) {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}