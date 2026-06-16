public class FactorialRecursion {

    static int factorial(int n) {
        // Base Condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive Call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}