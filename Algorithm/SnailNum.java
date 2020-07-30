import java.util.*;
public class SnailNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double v = sc.nextDouble();
        
        double day = (v-b)/(a-b);
        System.out.println((int)Math.ceil(day));
    }
}
