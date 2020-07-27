import java.util.*;
public class GroupWordChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int wordNum = sc.nextInt();
        int groupWordCount = 0;
        
        for (int i=0;i<wordNum;i++) {
            boolean alphabetCheck[] = new boolean[26];
            String word = sc.next();
            String currentAlphabet = word.substring(0,1);
            byte b = (byte)currentAlphabet.charAt(0);
            alphabetCheck[(int)b - 97] = true;
            
            for (int j=1;j<word.length();j++) {
                if (!word.substring(j,j+1).equals(currentAlphabet)) {
                    b = (byte)word.substring(j,j+1).charAt(0);
                    if (alphabetCheck[(int)b-97]) {
                        groupWordCount--;
                        break;
                    }
                    else {
                        currentAlphabet = word.substring(j,j+1);
                        alphabetCheck[(int)b-97] = true;
                    }
                }
            }
            groupWordCount++;
        }
        sc.close();
        
        if (groupWordCount < 0)
            groupWordCount = 0;
        System.out.println(groupWordCount);
    }
}
