import java.util.*;
public class ChessColor {
    public static char chess[][]; // 입력된 체스판의 색 저장
    public static char color[][]; // 기본 체스판의 색 저장
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine(); // 공백 한줄 입력 이걸 하지 않으면 chess[0]에 공백이 들어감
        
        chess = new char[m][n];
        color = new char[2][8];
        
        color[0] = "WBWBWBWB".toCharArray(); // 이걸와 다르면 색칠하는 걸로, 격자무늬를 맞출 수 있게
        color[1] = "BWBWBWBW".toCharArray();
        
        for (int i=0;i<m;i++) {
            String boardColor = sc.nextLine();
            chess[i] = boardColor.toCharArray();
        }
        sc.close();
        
        int min = Integer.MAX_VALUE;
        for (int i=0;i<m-7;i++) { // i, j는 row, column의 시작점을 의미 따라서 -7을 하는 것으로 8칸이 되는 모든 경우 조사 가능
            for (int j=0;j<n-7;j++) {
                min = Math.min(min, checkBoard(i, j));
            }
        }
        
        System.out.println(min);
    }
    
    public static int checkBoard(int row, int column) {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<color.length;i++) { // 맨 앞 칸이 W일 경우와 B일 경우 다 조사
            int count = 0;
            for (int j=0;j<color[0].length;j++) {
                for (int k=0;k<color[0].length;k++) {
                    if (chess[j+row][k+column] != color[(i+j)%2][k]) { // color의 색이랑 틀리면 색칠
                        count++;
                    }
                }
            }
            min = Math.min(min, count);
        }
        return min;
    }
} 
