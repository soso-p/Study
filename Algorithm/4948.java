import java.util.*;
public class 4948 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n==0)
                break;
            int count = 0;
            
            for (int i=n+1;i<=2*n;i++) {
                boolean check = false;
                if (i==2||i==3)
                    check = true;
                for (int j=2;j<=Math.sqrt(i);j++) {
                    if (i%j==0) {
                        check = false;
                        break;
                    }
                    check = true;
                }
                if (check)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
