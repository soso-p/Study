import java.util.*;
public class NAndM {
    static int arr[];
    static boolean status[];
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        arr = new int[m];
        status = new boolean[n+1];
        
        select(0, m, n);
    }
    
    public static void select(int index, int m, int n) {
        if (index == m) {
            for (int i=0;i<m;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i=1;i<=n;i++) {
                if (!status[i]) { // 방문하지 않은 곳만 가기
                    status[i] = true;
                    arr[index] = i;
                    select(index+1, m, n);
                    status[i] = false;
                }
            }
        }
    }
}
