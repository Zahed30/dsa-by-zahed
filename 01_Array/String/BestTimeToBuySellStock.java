/**
 * Problem: 121. Best Time to Buy and Sell Stock
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the lowest price found so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update max profit if selling today is better
            }
        }
        return maxProfit;
    }
}