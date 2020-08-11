import java.util.*;

public class StarOutput {
	public static char starCharacter[][];
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        starCharacter = new char[input][input];
        
        for (int i=0;i<input;i++) {
            for (int j=0;j<input;j++) {
                starCharacter[i][j] = ' ';
            }
        }
    	  star(0,0,input);
        StringBuilder sb = new StringBuilder(); // StringBuilder로 합쳐서 출력
        for (int i=0;i<input;i++) {
            sb.append(starCharacter[i]);
            sb.append("\n");
        }
    	System.out.println(sb);
	}
  
	public static void star(int a,int b,int n) { // 별 찍기
		if(n==1) { 
			starCharacter[a][b] = '*';
			return;
		}
		for(int i=0;i<3;i++) { 
			for(int j=0;j<3;j++) {
				if(i==1 && j==1) // 중간은 건너뛰기
					continue;
				star(a+(n/3*i),b+(n/3*j),n/3); 
			}
		}
	}
}
