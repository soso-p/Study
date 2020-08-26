import java.util.*;
public class NQueens {
    static int count = 0;
    static int chess[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        chess = new int[n];
        
        for (int i=0;i<n;i++) {
            chess[i] = -1;
        }
        
        selectQueen(0, n);
        System.out.println(count);
    }
    
    public static void selectQueen(int index, int n) {
        if (index==n) {
            count++;
        }
        else {
            for (int i=0;i<n;i++) {
                if (isPossible(index, i, n)) {
                    chess[index] = i;
                    selectQueen(index+1, n);
                    chess[index] = -1;
                }
            }
        }
    }
    
    public static boolean isPossible(int row, int column, int n) {
        for (int i=0;i<row;i++) {
            if (chess[i]==column)
                return false;
            if (Math.abs(chess[i]-column)==Math.abs(i-row)) // 서로 대각선에 존재하면 행의 차 값과 열의 차 값이 같다.
                return false;
        }
        return true;
    }
}
