import java.util.*;
public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int factorialNumber = factorial(n);
        System.out.println(factorialNumber);
    }
    
    public static int factorial(int n) {
        if (n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
