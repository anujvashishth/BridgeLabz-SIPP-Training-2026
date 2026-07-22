public class PairSum {
    public static void findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair Found: " + arr[left] + " + " + arr[right] + " = " + target);
                System.out.println("Indices: " + left + ", " + right);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("No pair found.");
    }
    public static void main(String[] args) {
        int[] transactions = {5000, 10000, 12000, 18000, 25000, 30000};
        int target = 30000;

        findPair(transactions, target);
    }
    
}
