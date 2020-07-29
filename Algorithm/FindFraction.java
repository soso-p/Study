import java.util.*;
public class FindFraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean direction = false; // 내려감
        int num = 1;
        int end = 1;
        int i = 2;
        
        if (num == x)
            System.out.println("1/1");
        else {
            num++;
            while (true) {
                end = end + i;
                if (x>=num && x<=end) {
                    if (!direction) {
                        System.out.println((1+(x-num))+"/"+(i-(x-num)));
                    }
                    else {
                        System.out.println((i-(x-num))+"/"+(1+(x-num)));
                    }
                    break;
                }
                else {
                    direction = !direction;
                    num = end+1;
                    i++;
                }
            }
        }
    }
}
