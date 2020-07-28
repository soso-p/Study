import java.util.*;
public class RecursiveDeliverySugar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sugarWeight = sc.nextInt();
        sc.close();
        
        System.out.println(checkNum(sugarWeight));
    }
    
    public static int checkNum(int n) {
        if (n == 0)
            return 0;
        else if ((n==4)||(n==1)||(n==2)||(n<0))
            return -1;
        else {
            int tmp5Kg = checkNum(n-5);
            int tmp3Kg = checkNum(n-3);
            
            if (tmp5Kg == -1 && tmp3Kg == -1)
                return -1;
            else if (tmp5Kg != -1 && tmp3Kg == -1)
                return tmp5Kg + 1;
            else if(tmp5Kg == -1 && tmp3Kg != -1)
                return tmp3Kg + 1;
            else {
                if (tmp5Kg >= tmp3Kg)
                    return tmp3Kg + 1;
                else
                    return tmp5Kg + 1;
            }
        }
    }
}
