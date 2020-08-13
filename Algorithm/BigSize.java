import java.util.*;
public class BigSize {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int weight[] = new int[number];
        int height[] = new int[number];
        int rank[] = new int[number];
        
        for (int i=0;i<number;i++) {
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
            rank[i] = 1;
        }
        
        for (int i=0;i<number;i++) { // 한 명씩 다 대조해보기
            for (int j=0;j<number;j++) {
                if (i==j) // 자기 자신이면 넘어가기
                    continue;
                if (weight[i]<weight[j] && height[i]<height[j]) // 비교하는 자보다 키, 몸무게가 작으면 등급 낮추기
                    rank[i] = rank[i]+1;
            }
        }
        
        for (int i=0;i<number;i++) {
            System.out.print(rank[i]+" ");
        }
    }
}
