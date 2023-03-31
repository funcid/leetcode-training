class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0], profit = 0;

        for (int i = 0; i < prices.length; i++) {

            int val = prices[i];

            if (min > val) {
                min = val;
                continue;
            }
             if (val - min > profit) {
                profit = val - min;
            }
        }

        return profit;
    }
}