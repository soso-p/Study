import java.util.*;
public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = -1;
        int min = Integer.MAX_VALUE;
        
        for (int i=m;i<=n;i++) {
            boolean check = false;
            
            if (i==2) {
            	check = true;
            }
            else {
	            for (int j=2;j<i;j++) {
	                if (i%j==0) {
	                    check = false;
	                    break;
	                }
	                check = true;
	            }
            }
            
            if (check) {
                if (sum == -1)
                    sum = 0;
                sum += i;
                min = Math.min(min, i);
            }
        }
        sc.close();
        
        System.out.println(sum);
        if (sum != -1)
            System.out.println(min);
    }
}
