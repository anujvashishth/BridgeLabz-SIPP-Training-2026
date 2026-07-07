public class Selection{
    public static void main(String[] args) {
        int[] scores = {78, 92, 45, 67, 88, 54};

        System.out.println("Original Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        // Selection Sort
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("\nSorted Exam Scores (Ascending):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}