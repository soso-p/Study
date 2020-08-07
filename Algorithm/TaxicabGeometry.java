import java.util.*;
public class TaxicabGeometry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();
        
        double euclideanCircle = radius*radius*Math.PI; // 유클리드 기하학으로 계산
        double taxiCircle = radius*radius*2; // 택시 기하학으로 계산
        
        System.out.println(euclideanCircle);
        System.out.println(taxiCircle);
    }
}
