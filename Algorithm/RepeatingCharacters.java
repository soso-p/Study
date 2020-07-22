import java.util.*;
public class RepeatingCharacters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = sc.nextInt();
        
        for (int i=0;i<caseNumber;i++) {
            int iterationNumber = sc.nextInt();
            String originalString = sc.next();
            
            for (int j=0;j<originalString.length();j++)
                for (int k=0;k<iterationNumber;k++) {
                    if (originalString.substring(j, j+1).equals("\\"))
                        System.out.print("\\");
                    else
                        System.out.print(originalString.substring(j,j+1));
                }
            System.out.println();
        }
    }
}
