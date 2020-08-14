import java.util.*;
public class SortNumber {
    public static int number[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number = new int[n];
        
        for (int i=0;i<n;i++) {
            number[i] = sc.nextInt();
        }
        sc.close();
        
        insertionSort();
        
        for (int i=0;i<n;i++) {
            System.out.println(number[i]);
        }
    }
    
    public static void insertionSort() {
        for (int i=1;i<number.length;i++) {
        	int key = number[i];
        	int j=i-1;
            for (j=i-1;j>=0 && key<number[j];j--) {
                number[j+1] = number[j];
            }
            number[j+1] = key; // for 문이 break가 아닌 그냥 종료할 때가 있기 때문에 else문으로 for 안에서 처리 불가
        }
    }
}
