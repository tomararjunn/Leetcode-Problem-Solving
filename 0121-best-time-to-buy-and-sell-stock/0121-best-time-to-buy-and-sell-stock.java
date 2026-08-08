class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < mini) {
            mini = prices[i];
            }
            int profit = prices[i] - mini;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
