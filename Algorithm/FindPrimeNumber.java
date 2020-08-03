import java.util.*;
public class FindPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numOfNum = sc.nextInt();
        int count = 0;
        
        for (int i=0;i<numOfNum;i++) {
            int number = sc.nextInt();
            boolean check = false;
            if (number==2)
                check = true;
            for (int j=2;j<number;j++) {
                if (number%j==0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check)
                count++;
        }
        sc.close();
        System.out.println(count);
    }
}
