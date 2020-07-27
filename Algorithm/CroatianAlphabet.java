/*
크로아티아 알파벳 | 변경
č | c=
ć | c-
dž | dz=
đ | d-
lj | lj
nj | nj
š | s=
ž | z=
*/
import java.util.*;
public class CroatianAlphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String croatianAlphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = sc.next();
        sc.close();
        int startIndex = str.length()+1;
        int finishIndex = startIndex;
        int alphabetCount = 0;
        
        while(str.length()>0) {
            startIndex = 101;
            finishIndex = 101;
            for (int i=0;i<8;i++) {
                if ((startIndex>str.indexOf(croatianAlphabet[i]))&&(str.indexOf(croatianAlphabet[i])!=-1)) {
                    startIndex = str.indexOf(croatianAlphabet[i]);
                    finishIndex = startIndex + croatianAlphabet[i].length();
                }
            }
            if (str.length()>1) {
                if (startIndex != 0) {
                    str = str.substring(1);
            	}
                else {
                    str = str.substring(finishIndex);
                }
                alphabetCount++;
            }
            else {
            	alphabetCount++;
            	break;
            }
        }
        
        System.out.println(alphabetCount);
    }
}
