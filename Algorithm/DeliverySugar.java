import java.util.*;
public class DeliverySugar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sugarWeight = sc.nextInt();
        sc.close();
        int count = 10000;
        
        for (int i=0;i<=sugarWeight/5;i++) {
            int temp = sugarWeight - 5*i;
            for (int j=0;j<=temp/3;j++) {
                int sum = 5*i + j*3;
                if (sum == sugarWeight) {
                    if (count>(i+j))
                        count = i+j;
                }
            }
        }
        
        if (count == 10000)
            count = -1;
        System.out.println(count);
    }
}
