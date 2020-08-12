import java.util.*;
public class DigitGenerator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = 0;
        
        for (int i=10;i<n;i++) {
            int tmp = i;
            int iTmp = i;
            while (iTmp!=0) {
                tmp += iTmp%10;
                iTmp = iTmp/10;
            }
            
            if (tmp==n) {
                m = i;
                break;
            }
        }
        
        System.out.println(m);
    }
}
