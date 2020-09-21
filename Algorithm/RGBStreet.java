import java.util.*;
public class RGBStreet {
    static ArrayList<House> houses = new ArrayList<House>();
    static int totalRedCost = 0; // 직전 선택이 red
    static int totalGreenCost = 0; // 직전 선택이 green
    static int totalBlueCost = 0; // 직전 선택이 blue
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=0;i<n;i++) {
            int redCost = sc.nextInt();
            int greenCost = sc.nextInt();
            int blueCost = sc.nextInt();
            houses.add(new House(redCost, greenCost, blueCost));
        }
        sc.close();
        
        calculateCost(n);
        
        System.out.println(Math.min(Math.min(totalRedCost, totalGreenCost), totalBlueCost));
    }
    
    public static void calculateCost(int n) {
        House house = houses.get(0);
        int redCost = house.getRedCost();
        int greenCost = house.getGreenCost();
        int blueCost = house.getBlueCost();
        
        totalRedCost += redCost;
        totalGreenCost += greenCost;
        totalBlueCost += blueCost;
        
        for (int i=1;i<n;i++) {
            house = houses.get(i);
            redCost = house.getRedCost();
            greenCost = house.getGreenCost();
            blueCost = house.getBlueCost();
            int beforeRedCost = totalRedCost; // 직전 값을 저장해놓고 이걸로 비교하기
            int beforeGreenCost = totalGreenCost;
            int beforeBlueCost = totalBlueCost;
            
            // 값이 바뀌기 때문에 그 전 값을 저장해야됨
            totalRedCost = Math.min(beforeGreenCost, beforeBlueCost) + redCost; // 빨간색을 선택하는 경우이기 때문에 직전 초록색, 파란색을 선택한 값 중 작은 값과 함께 더해줌
            totalGreenCost = Math.min(beforeRedCost, beforeBlueCost) + greenCost;
            totalBlueCost = Math.min(beforeRedCost, beforeGreenCost) + blueCost;
        }
    }
}

class House {
    private int redCost;
    private int greenCost;
    private int blueCost;
    
    public House(int redCost, int greenCost, int blueCost) {
        this.redCost = redCost;
        this.greenCost = greenCost;
        this.blueCost = blueCost;
    }
    
    public int getRedCost() { return redCost; }
    public int getGreenCost() { return greenCost; }
    public int getBlueCost() { return blueCost; }
}
