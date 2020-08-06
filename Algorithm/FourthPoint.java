import java.util.*;
public class FourthPoint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> xPoint = new ArrayList<Integer>();
        ArrayList <Integer> yPoint = new ArrayList<Integer>();
        
        for (int i=0;i<3;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (!xPoint.contains(x)) {
                xPoint.add(x);
            }
            else  {
                xPoint.remove(xPoint.indexOf(x));
            }
            
            if (!yPoint.contains(y))
                yPoint.add(y);
            else
                yPoint.remove(yPoint.indexOf(y));
        }
        sc.close();
        
        System.out.println(xPoint.get(0) + " " + yPoint.get(0));
    }
}
