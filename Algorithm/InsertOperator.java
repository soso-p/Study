import java.util.*;
public class InsertOperator {
    static int number[]; // 피연산자 저장
    static int max = Integer.MIN_VALUE; // 최댓값 저장
    static int min = Integer.MAX_VALUE; // 최솟값 저장
    static int result = 0; // 계산한 값 저장
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new int[n];
        
        for (int i=0;i<n;i++) {
            number[i] = sc.nextInt();
        }
        result = number[0]; // 미리 맨 처음 피연산자를 넣어놓음
        
        int plus = sc.nextInt();
        int minus = sc.nextInt();
        int multiplication = sc.nextInt();
        int division = sc.nextInt();
        
        calculate(1, n, plus, minus, multiplication, division);
        
        System.out.println(max);
        System.out.println(min);
    }
    
    public static void calculate(int index, int n, int plus, int minus, int multiplication, int division) {
        if (index == n) { // 모든 피연산자를 계산했으면 끝
            if (max < result) { // max, min과 비교하여 최댓값, 최솟값이면 저장
                max = result;
            }
            if (min > result) {
                min = result;
            }
        }
        else {
            int resultTmp = result; // 마지막 계산 값을 저장해놓음
            if (plus > 0) {
                result += number[index];
                calculate(index+1, n, plus-1, minus, multiplication, division);
                result = resultTmp; // 마지막 계산 값으로 되돌아가기
            }
            if (minus > 0) {
                result -= number[index];
                calculate(index+1, n, plus, minus-1, multiplication, division);
                result = resultTmp;
            }
            if (multiplication > 0) {
                result *= number[index];
                calculate(index+1, n, plus, minus, multiplication-1, division);
                result = resultTmp;
            }
            if (division > 0) {
                if (result < 0) { // 음수로 양수를 나눠야되면 음수를 양수로 바꾸고 나눈 후 다시 음수로 변환
                    result = Math.abs(result);
                    result /= number[index];
                    result = -result;
                }
                else {
                    result /= number[index];
                }
                calculate(index+1, n, plus, minus, multiplication, division-1);
                result = resultTmp;
            }
        }
    }
}
