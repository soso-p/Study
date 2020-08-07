import java.util.*;
public class Turret {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        
        for (int i=0;i<testCase;i++) {
            // 터렛1, 터렛2의 좌표와 수색범위 입력
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            
            double R1 = Math.pow((r1-r2), 2);
            double R2 = Math.pow((r1+r2), 2);
            int distance = (int)(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
            
            if ((x1==x2)&&(y1==y2)&&(r1==r2)) // 두 원이 동일하면 가능한 위치 무한개
                System.out.println("-1");
            else if (distance==R1||distance==R2) // 두 원이 내접 or 외접
                System.out.println("1");
            else if (distance<R1||distance>R2) // 두 원이 만나지 않음
                System.out.println("0");
            else
                System.out.println("2");
        }
        sc.close();
    }
}
