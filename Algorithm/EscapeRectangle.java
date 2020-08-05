import java.util.*;
public class EscapeRectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int rowLength = w-x;
        int columnLength = h-y;
        
        int minLength = Math.min(Math.min(Math.min(x, rowLength), y), columnLength);
        System.out.println(minLength);
    }
}
