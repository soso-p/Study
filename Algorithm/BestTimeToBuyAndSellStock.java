class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minimumPrice = prices[0];
        
        for (int i=1;i<prices.length;i++) {
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            }
            else {
                maximumProfit = Math.max(maximumProfit, (prices[i] - minimumPrice));
            }
        }
        return maximumProfit;
    }
}
