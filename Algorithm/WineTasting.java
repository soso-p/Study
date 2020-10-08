import java.util.*; 
public class WineTasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wine[] = new int[n];
        int dp[] = new int[n];
        
        for (int i=0;i<n;i++) {
            wine[i] = sc.nextInt();
        }
        sc.close();
        
        if (n>=1) {
            dp[0] = wine[0];
        }
        if (n>=2) {
            dp[1] = wine[0] + wine[1];
        }
        if (n>=3) { // i-3인 경우까지 계산하기 때문에 따로 빼줘야 함
            // oox, oxo, xoo인 경우를 비교
            dp[2] = Math.max(dp[1], Math.max(dp[0] + wine[2], wine[1] + wine[2]));
        }
        for (int i=3;i<n;i++) {
            //oox, oxo, xoo인 경우를 비교
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + wine[i], dp[i-3] + wine[i-1] + wine[i]));
        }
        System.out.println(dp[n-1]);
    }
}
