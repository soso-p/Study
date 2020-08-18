import java.util.*;
public class SortInside {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        while (number!=0) {
            numberList.add(number%10);
            number = number/10;
        }
        
        Collections.sort(numberList, Collections.reverseOrder());
        for (int i=0;i<numberList.size();i++) {
            System.out.print(numberList.get(i));
        }
    }
}
