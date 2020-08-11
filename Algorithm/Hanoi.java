import java.util.*;
import java.io.*;
public class Hanoi {
    static int count = 0; // 원판 이동 수 저장
    static ArrayList list = new ArrayList(); // 이동한 기둥 순서대로 저장
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int circleNumber = sc.nextInt();
        sc.close();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        hanoiTower(1, 2, 3, circleNumber);
        
        bw.write(count+"\n");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) { // 이동한 순서 출력
        	bw.write(iterator.next()+" "+iterator.next()+"\n");
        }
        bw.flush();
        bw.close();
    }
    
    public static void hanoiTower(int src, int tmp, int to, int n) {
        if (n>0) {
            count++;
            hanoiTower(src, to, tmp, n-1);
            list.add(src); // 기둥 이동 저장
            list.add(to);
            hanoiTower(tmp, src, to, n-1);
        }
    }
}
