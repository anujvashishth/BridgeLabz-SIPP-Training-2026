public class TowerHanoi {
    public void helper(int n, char A, char B, char C){
        if(n==1){
            System.out.println("move disk" + A + "to" + C);
        }
        helper(n-1, A, B, C);
        System.out.println("Move disk " + n + " from " + A + " to " + C);
        helper(n - 1, C, A, B);
    }
    public static void main(String[] args) {
        TowerHanoi obj = new TowerHanoi();
        obj.helper(3, 'A', 'B', 'C');
    }
}
    
