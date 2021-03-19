class Solution {
    public int climbStairs(int n) {
        int ways[] = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
       
        // 계단은 한 번에 한 칸 혹은 두 칸씩 오를 수 있음.
        // i번째에 도착하는 방법의 수는 i-2번째 도착하는 방법의 수 + i-1번째 도착하는 방법의 수
        for (int i=2;i<n+1;i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        
        return ways[n];
    }
}
