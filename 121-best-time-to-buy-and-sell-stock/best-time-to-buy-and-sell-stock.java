class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int n = prices.length;
        
        for(int i=0; i<n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        
        return profit;
    }
}