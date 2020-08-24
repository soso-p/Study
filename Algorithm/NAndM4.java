import java.util.*;
import java.io.*;
public class NAndM4 {
    static int n;
    static int m;
    static int arr[];
    static BufferedWriter bw;
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();
        arr = new int[m];
        
        select(0);
        bw.flush();
        bw.close();
    }
    
    public static void select(int index) throws IOException {
        if (index == m) {
            for (int i=0;i<m;i++) {
                bw.write(arr[i]+" ");
            }
            bw.newLine();
        }
        else {
            int i;
            if (index==0)
                i = 1;
            else // 앞 수보다 크거나 같은 수만 선택하기 
                i = arr[index-1];
            for (;i<=n;i++) {
                arr[index] = i;
                select(index+1);
            }
        }
    }
}
