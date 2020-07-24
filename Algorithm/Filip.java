import java.util.*;
public class Filip {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();
        
        StringBuffer sb = new StringBuffer(str1);
        str1 = sb.reverse().toString();
        sb = new StringBuffer(str2);
        str2 = sb.reverse().toString();
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        
        if (num1>=num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
}
