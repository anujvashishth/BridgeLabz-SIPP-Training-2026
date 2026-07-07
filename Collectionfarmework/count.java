public class count {
    public static void main(String[] args) {
        int[] arr = {7, 7, 1, 2, 0, 8, 3};
         System.out.println("Original Array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] count1 = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count1[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < count1.length; i++) {
            while (count1[i] > 0) {
                arr[index] = i;
                index++;
                count1[i]--;
            }
        }

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
