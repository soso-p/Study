import java.util.*;
public class FibonacciNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(findFibonacciNumber(n));
    }
    
    public static int findFibonacciNumber(int n) {
        if (n==0||n==1)
            return n;
        else
            return findFibonacciNumber(n-1)+findFibonacciNumber(n-2);
    }
}
