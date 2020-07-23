import java.util.*;
public class WordCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();
        
        String array[] = str.split(" ");
        
        if (str.equals(""))
            System.out.println(0);
        else
            System.out.println(array.length);
    }
}
