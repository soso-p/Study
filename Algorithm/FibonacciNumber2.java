import java.util.*;
public class FibonacciNumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(FibonacciNumber(n));
    }
    
    public static long FibonacciNumber(int n) {
        long fibonacci[] = new long[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i=2;i<=n;i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        
        return fibonacci[n];
    }
}
