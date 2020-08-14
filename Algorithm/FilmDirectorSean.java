import java.util.*;
public class FilmDirectorSean {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        sc.close();
        int count = 0;
        int number = 1;
        String numberString = Integer.toString(number);
        
        while(count<nth) {
            numberString = Integer.toString(number);
            if (numberString.contains("666"))
                count++;
            number++;
        }
        
        System.out.println(numberString);
    }
}
