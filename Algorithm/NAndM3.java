import java.util.*;
import java.io.*;
public class NAndM3 {
	static int arr[];
	static int n;
	static int m;
	static BufferedWriter bw;
    public static void main(String args[]) throws IOException {
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
    
    public static void select(int index) throws IOException{
    	if (index==m) {
            for (int i=0;i<m;i++) {
                bw.write(arr[i]+" "); // BufferedWriter로 하지 않으면 시간 
            }
    		bw.newLine();
    	}
        else {
            for (int i=1;i<=n;i++) {
                arr[index] = i;
                select(index+1);
            }
        }
    }
}
