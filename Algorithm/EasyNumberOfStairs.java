import java.util.*;
public class EasyNumberOfStairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        long stairNumber[][] = new long[n][10];
        
        for (int i=0;i<10;i++) {
            stairNumber[0][i] = 1;
        }
        
        for (int i=1;i<n;i++) { // 길이가 1인 계단 수의 개수부터 n인 계단 수의 개수까지 구하기
            for (int j=0;j<10;j++) {
                if (j==0) { // 0인 경우는 그 전 길이의 계단 수의 1로 시작하는 계단 수의 개수
                    stairNumber[i][j] = stairNumber[i-1][1] % 1000000000;
                }
                else if (j==9) { // 9로 시작하는 계단 수는 그 전 길이의 8로 시작하는 계단 수만 더 함
                    stairNumber[i][j] = stairNumber[i-1][j-1] % 1000000000;
                }
                else { // 나머지는 그 전 길이의 시작하는 수의 -1 +1의 계단 수 더 함
                    stairNumber[i][j] = (stairNumber[i-1][j-1] + stairNumber[i-1][j+1]) % 1000000000;
                }
            }
        }
        
        long sum = 0;
        for (int i=1;i<10;i++) {
            sum += stairNumber[n-1][i] % 1000000000;
        }
        
        System.out.println(sum%1000000000); // 결과값에 %연산을 해주지 않으면 10억보다 크기가 커지게 된다.
    }
}
