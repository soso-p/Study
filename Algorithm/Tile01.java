import java.util.*;
public class Tile01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int tile[] = new int[n+1];
        tile[0] = 0;
        if (n >= 1)
            tile[1] = 1;
        if (n >= 2)
            tile[2] = 2;
        
        for (int i=3;i<=n;i++) {
            tile[i] = (tile[i-2] + tile[i-1])%15746;
        }
        
        System.out.println(tile[n]);
    }
}
