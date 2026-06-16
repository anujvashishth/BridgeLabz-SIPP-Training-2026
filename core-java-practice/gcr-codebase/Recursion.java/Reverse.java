public class Reverse {
    static void printReverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReverse(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printReverse(n);
    }
    
}
