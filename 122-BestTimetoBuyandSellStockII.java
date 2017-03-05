/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @If the price tomorror is higher,then buy today and sell tomorrow.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int date = prices.length;
        if(date == 0 || date == 1)
            return 0;
        int profit = 0;
        for(int day = 0;day < date - 1;day++){
            if(prices[day] < prices[day + 1]){
                profit += prices[day + 1] - prices[day];
            }
        }
        return profit;
    }
}
