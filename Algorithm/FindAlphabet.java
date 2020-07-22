import java.util.*;
public class FindAlphabet {
    static int location[] = new int[26];
    static boolean check[] = new boolean[26];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for (int i=0;i<26;i++) {
            location[i] = -1;
        }
        
        for (int i=0;i<s.length();i++) {
           byte byteS = (byte)s.charAt(i);
            if (checkSubS(byteS))
                continue;
            else {
                int l = (int)byteS - 97;
                location[l] = i;
            }
        }
        
        for (int i=0;i<26;i++) {
            System.out.print(location[i] + " ");
        }
    }
    
    public static boolean checkSubS(byte byteS) {
        int l = (int)byteS - 97;
        if (check[l])
            return true;
        else {
            check[l] = true;
            return false;
        }
    }
}
