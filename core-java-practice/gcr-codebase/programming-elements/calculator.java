import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        float div = n1/n2;
        System .out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+ n1 + " and " + n2 + " is "+ sum + ", "+ sub + ", "+ mul + ", and "+ div);
        
    }
    
}
