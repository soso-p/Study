import java.util.*;
public class NAndM2 {
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
            int i;
            // 탐색하는 범위를 index-1의 수보다 크게 함
            if (index==0)
                i = 1;
            else
                i = arr[index-1] + 1;
            for (;i<=n;i++) {
                if (!status[i]) {
                    status[i] = true;
                    arr[index] = i;
                    select(index+1, m, n);
                    status[i] = false;
                }
            }
        }
    }
}
