import java.util.*;
public class FibonacciFunction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        for (int i=0;i<testCase;i++) {
            number.add(sc.nextInt());
        }
        sc.close();
        
        int max = Collections.max(number);
        int number0[] = new int[max+1];
        int number1[] = new int[max+1];
        
        number0[0] = 1;
        number0[1] = 0;
        number1[0] = 0;
        number1[1] = 1;
        
        for (int i=2;i<=max;i++) { // 입력 값의 최대값까지의 0, 1 호출 수 
            number0[i] = number0[i-1] + number0[i-2];
            number1[i] = number1[i-1] + number1[i-2];
        }
        
        for (int i=0;i<number.size();i++) {
            System.out.println(number0[number.get(i)]+ " " +number1[number.get(i)]);
        }
    }
}
