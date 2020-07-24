import java.util.*;
public class Baka {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int totalTime = 0;
        
        for (int i=0;i<str.length();i++) {
            totalTime += replaceStringToTime(str.substring(i, i+1));
        }
        
        System.out.println(totalTime);
    }
    
    public static int replaceStringToTime(String s) { // 문자 하나를 그에 맞는 시간으로 바꿔주는 메소드
        if (s.equals("A")||s.equals("B")||s.equals("C"))
            return 3;
        else if (s.equals("D")||s.equals("E")||s.equals("F"))
            return 4;
        else if (s.equals("G")||s.equals("H")||s.equals("I"))
            return 5;
        else if (s.equals("J")||s.equals("K")||s.equals("L"))
            return 6;
        else if (s.equals("M")||s.equals("N")||s.equals("O"))
            return 7;
        else if (s.equals("P")||s.equals("Q")||s.equals("R")||s.equals("S"))
            return 8;
        else if (s.equals("T")||s.equals("U")||s.equals("V"))
            return 9;
        else
            return 10;
    }
}
