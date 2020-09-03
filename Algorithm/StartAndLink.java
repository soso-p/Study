import java.util.*;
public class StartAndLink {
    static int s[][]; // 각 팀원간의 능력치 저장
    static int min = Integer.MAX_VALUE;
    static boolean select[]; // 스타트 팀에 선택되었는 지 입력
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = new int[n][n];
        select = new boolean[n];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        calculateMin(0, n/2, 0); // 팀 정하고 최소값 확인
        
        System.out.println(min);
    }
    
    public static void calculateMin(int index, int n, int start) {
        if (n == index) { // 다 골랐으면 최소값 
            int selectTeam = 0;
            int nonSelectTeam = 0;
            for (int i=0;i<(n*2);i++) {
                for (int j=0;j<(n*2);j++) {
                    if (i==j)
                        continue;
                    if (select[i]&&select[j]) {
                        selectTeam += s[i][j];
                    }
                    else if ((!select[i])&&(!select[j])) {
                        nonSelectTeam += s[i][j];
                    }
                }
            }
            if (Math.abs(selectTeam - nonSelectTeam) < min) {
                min = Math.abs(selectTeam - nonSelectTeam);
            }
        }
        else {
            for (int i=start;i<(n*2);i++) { // (1, 2)를 선택하고 (2, 1)도 확인하는 경우가 없도록 start부터 시작
                if (!select[i]) {
                    select[i] = true;
                    calculateMin(index+1, n, i+1);
                    select[i] = false;
                }
            }
        }
    }
}
