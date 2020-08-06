import java.util.*;
public class RightAngledTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a==0&&b==0&&c==0)
                break;
            int x;
            boolean check = false;
            if ((c>a)&&(c>b)) {
                x = a*a + b*b;
                if (x==(c*c)) 
                    check = true;
            }
            else if ((b>a)&&(b>c)) {
                x = a*a + c*c;
                if (x==(b*b))
                    check = true;
            }
            else if ((a>b)&&(a>c)) {
                x = b*b + c*c;
                if (x==(a*a))
                    check = true;
            }
            
            if (check)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
        sc.close();
    }
} 
