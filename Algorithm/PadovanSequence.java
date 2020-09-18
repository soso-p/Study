import java.util.*;
public class PadovanSequence {
    static long p[];
    static int max = Integer.MIN_VALUE;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int number[] = new int[testCase];
        
        for (int i=0;i<testCase;i++) {
            number[i] = sc.nextInt();
            if (number[i]>max) {
                max = number[i]; // 입력된 n 중 최댓값을 찾아 거기까지 수열의 값을 구하기
            }
        }
        p = new long[max+1]; // 입력될 수 있는 최대값인 100의 p값은 int의 범위를 넘어간다
        
        findPadovanSequence();
        
        for (int i=0;i<testCase;i++) {
            System.out.println(p[number[i]]);
        }
    }
    
    public static void findPadovanSequence() {
        p[0] = 0;
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        
        for (int i=4;i<=max;i++) {
            p[i] = p[i-3] + p[i-2];
        }
    }
}
