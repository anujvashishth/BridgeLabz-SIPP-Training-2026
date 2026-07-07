public class insertsort {
     public static void main(String[] args) {
        int[] empIDs = {105, 101, 109, 103, 107, 102};

        System.out.println("Original Employee IDs:");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }

        // Insertion Sort
        int n = empIDs.length;

        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
 
            empIDs[j + 1] = key;
        }

        System.out.println("\nSorted Employee IDs (Ascending):");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }
    }
}
