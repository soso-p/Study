import java.util.*;
public class IntegerTriangle {
    static int number[][];
    static int result[][];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new int[n][];
        result = new int[n][];
        
        int j = 1;
        for (int i=0;i<n;i++) {
            number[i] = new int[j];
            result[i] = new int[j];
            for (int k=0;k<j;k++) {
                number[i][k] = sc.nextInt();
            }
            j++;
        }
        sc.close();
        
        result[0][0] = number[0][0];
        j = 2;
        for (int i=1;i<n;i++) {
            for (int k=0;k<j;k++) {
                if (k==0) {
                    result[i][k] = result[i-1][k] + number[i][k];
                }
                else if (k==(j-1)) {
                    result[i][k] = result[i-1][k-1] + number[i][k];
                }
                else {
                    result[i][k] = Math.max(result[i-1][k-1], result[i-1][k]) + number[i][k]; // 두 대각선의 값 중 큰 값과 더함
                }
            }
            j++;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++) { // 최대값 찾기
            max = Math.max(max, result[n-1][i]);
        }
        System.out.println(max);
    }
}
