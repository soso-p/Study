import java.util.*;
public class 1929 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i=m;i<=n;i++) {
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
                System.out.println(i);
        }
        sc.close();
    }
}
