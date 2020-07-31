import java.util.*;

public class CalculateNum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int taseCase = sc.nextInt();
 
        for (int t=0;t<taseCase;t++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int num[][] = new int[k+1][n+1];            

            for (int j=1;j<=n;j++)
                num[0][j] = j;
            for (int i=1;i<=k;i++)
                num[i][1] = 1;
            for (int i=1;i<=k;i++) {
                for (int j=2;j<=n;j++) {
                    num[i][j] = num[i][j-1] + num[i-1][j];
                }
            }
            System.out.println(num[k][n]);
        }
        sc.close();
    }
}
