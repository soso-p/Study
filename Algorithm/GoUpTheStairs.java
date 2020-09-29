import java.util.*;
public class GoUpTheStairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n+1];
        int step[] = new int[n+1]; // 직전 계단을 밟은 경우
        int nonStep[] = new int[n+1]; // 직전 계단을 밟지 않은 경우
        
        for (int i=1;i<=n;i++) {
            score[i] = sc.nextInt();
        }
        sc.close();
        
        step[0] = 0;
        nonStep[0] = 0;
        step[1] = score[1];
        nonStep[1] = score[1];
        
        // 직전 계단을 밟은 경우와 안밟은 경우를 나눠서 저장
        for (int i=2;i<=n;i++) {
            step[i] = nonStep[i-1] + score[i];
            nonStep[i] = Math.max(nonStep[i-2], step[i-2]) + score[i];
        }
        
        System.out.println(Math.max(step[n], nonStep[n]));
    }
}
