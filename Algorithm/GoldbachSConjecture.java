import java.util.*;
public class GoldbachSConjecture {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int n[] = new int[testCase];
        int max = 0;
        
        for (int i=0;i<testCase;i++) {
            n[i] = sc.nextInt();
            if (max<n[i])
                max = n[i];
        }
        
        boolean primeNumberCheck[] = new boolean[max+1];
        for (int i=2;i<primeNumberCheck.length;i++) {
            primeNumberCheck[i] = true;
        }
        
        for (int i=2;i<primeNumberCheck.length;i++) { // 에라토스테네스의 체
            if (primeNumberCheck[i]) {
                for (int j=i+i;j<=max;j+=i) { // 소수의 배수 다 지우기
                    primeNumberCheck[j] = false;
                }
            }
        }
        
        for (int i=0;i<testCase;i++) { // 골드바흐의 추측 계산
            int smallNumber = n[i]/2;
            int highNumber = n[i]/2;
            
            while(!primeNumberCheck[smallNumber] || !primeNumberCheck[highNumber]) { // 두 소수는 n/2의 값과의 차가 같다
                smallNumber--;
                highNumber++;
            }
            
            System.out.println(smallNumber + " " + highNumber);
        }
    }
}
