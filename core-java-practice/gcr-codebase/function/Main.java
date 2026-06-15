import java.util.*;

class MathWizard {
     int instanceVar = 100;
    public boolean isPrime(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public long factorial(int n){
        int fact = 1;
        for(int i=0;i<=n;i++){
            fact*=1;
        }
        return fact;
    }
    public void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }
    public void showScope() {

        // Local variable
        int instanceVar = 50;

        System.out.println("Local Variable = " + instanceVar);
        System.out.println("Instance Variable = " + this.instanceVar);
    }
    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Is 17 Prime? " + mw.isPrime(17));

        System.out.println("Factorial(5) = " + mw.factorial(5));

        mw.fibonacci(10);

        System.out.println("GCD(24,36) = " + mw.gcd(24, 36));

        System.out.println("LCM(24,36) = " + mw.lcm(24, 36));

        System.out.println("2^5 = " + mw.power(2, 5));
    }
}
