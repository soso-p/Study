import java.util.*;
public class StudyWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        char maxChar = '?';
        int maxAlphabetNum = 0;
        int alphabetCount[] = new int[26];
        
        for (int i=0;i<str.length();i++) {
            alphabetCount[str.charAt(i)-65]++;
            if (maxAlphabetNum < alphabetCount[str.charAt(i) - 65]) {
                maxAlphabetNum = alphabetCount[str.charAt(i)-65];
                maxChar = str.charAt(i);
            }
            else if (maxAlphabetNum == alphabetCount[str.charAt(i)-65])
                maxChar = '?';
        }
        
        System.out.println(maxChar);
        
        sc.close();
    }
}
