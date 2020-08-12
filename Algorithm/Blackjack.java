import java.util.*;
public class Blackjack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cardNumber = sc.nextInt();
        int m = sc.nextInt();
        int card[] = new int[cardNumber];
        int max = 0;
        
        for (int i=0;i<cardNumber;i++) {
            card[i] = sc.nextInt();
        }
        sc.close();
        
        for (int i=0;i<cardNumber;i++) {
            for (int j=i+1;j<cardNumber;j++) {
                for (int k=j+1;k<cardNumber;k++) {
                    int tmp = card[i]+card[j]+card[k];
                    if (max<tmp&&tmp<=m)
                        max = tmp;
                }
            }
        }
        System.out.println(max);
    }
}
