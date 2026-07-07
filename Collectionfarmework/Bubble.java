public class Bubble {
    public static void main(String[] args) {
        int[] marks = {78, 45, 90, 62, 55, 81};

        System.out.println("Original Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        // Bubble Sort
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // Stop if no swaps occurred
            if (!swapped) {
                break;
            }
        }

        System.out.println("\nSorted Marks (Ascending):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
