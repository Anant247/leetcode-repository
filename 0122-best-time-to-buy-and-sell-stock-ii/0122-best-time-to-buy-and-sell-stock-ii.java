class Solution {
    public int maxProfit(int[] prices) {
        int profit= 0;
        int buy = prices[0];
        
        for(int i =1; i<prices.length; i++){
            if(buy >= prices[i]){
                buy = prices[i];
            } else {
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}

//Optimum
/* 
class Solution {
    public int maxProfit(int[] prices){
        int profit = 0;
        for(int i =1; i< prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
*/
