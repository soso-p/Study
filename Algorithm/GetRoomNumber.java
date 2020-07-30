import java.util.*;
public class GetRoomNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCaseNum = sc.nextInt();
        for (int i=0;i<testCaseNum;i++) {
            int height = sc.nextInt();
            int width = sc.nextInt();
            int nthPerson = sc.nextInt();
        
            int floor = nthPerson % height;
            int roomNumber = nthPerson/height + 1;
            if (floor==0) {
                floor = height;
                roomNumber--;
            }
            System.out.println(floor+String.format("%02d",roomNumber));
        }
        sc.close();
    }
}
