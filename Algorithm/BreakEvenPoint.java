import java.util.*;
public class BreakEvenPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (c<=b)
            System.out.println("-1");
        else {
            int breakEvenPointNum = (a/(c-b))+1;
            System.out.println(breakEvenPointNum);
        }
    }
}
