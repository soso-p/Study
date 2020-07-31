import java.util.*;
public class CalculateCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tastCase = sc.nextInt();
    
        for (int i=0;i<tastCase;i++) {
            int start = sc.nextInt();
            int arrival = sc.nextInt();
            int distance = arrival - start;
            int max = (int)Math.sqrt(distance);
            int count = 0;
        
            if (max == Math.sqrt(distance))
                count = 2 * max - 1;
            else if (distance<=(max*max)+max)
                count = 2 * max;
            else
                count = 2 * max + 1;
        
            System.out.println(count);
        }
    }
}
