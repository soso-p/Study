import java.util.*;
public class  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int round = 0;
        int start = 1;
        int end = 1;
        
        while (true) {
            end = end + round*6;
            
            if (n>=start && n<=end) {
                System.out.println(round+1);
                break;
            }
            else {
                start = end+1;
                round++;
            }
        }
    }
}
