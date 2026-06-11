public class eligibilityvote {
    public static void main(String[] args) {
        int age = 18;
        int [] arr = {20,13,15,18,19,25,14,11,28,30};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=18){
                System.out.println("eligibel for vote :" +arr[i]  );
            }else{
                System.out.println("eligibel for not age :" +arr[i]);
            }
        }
    }
    
}
