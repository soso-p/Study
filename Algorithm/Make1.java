import java.util.*;
public class Make1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int operationNumber[] = new int[n+1]; // 각 인덱스가 1이 될려면 필요한 연산 횟수
        operationNumber[0] = 0;
        operationNumber[1] = 0;
        
        for (int i=2;i<=n;i++) { // 현재 i에서 가능한 연산을 했을 때 연산 후 수들의 연산 횟수에 1을 더하기
            if (i%6==0) {
                operationNumber[i] = Math.min(Math.min(operationNumber[i/2], operationNumber[i/3]), operationNumber[i-1])+1;
            }
            else if (i%3==0) {
                operationNumber[i] = Math.min(operationNumber[i/3], operationNumber[i-1]) + 1;
            }
            else if (i%2==0) {
                operationNumber[i] = Math.min(operationNumber[i/2], operationNumber[i-1]) + 1;
            }
            else {
                operationNumber[i] = operationNumber[i-1] + 1;
            }
        }
        
        System.out.println(operationNumber[n]);
    }
}
