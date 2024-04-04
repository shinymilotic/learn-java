public class BestTimetoBuyandSellStock {

    // Given an array nums of size n, return the majority element.

    // The majority element is the element that appears more than ⌊n / 2⌋ times.
    //  You may assume that the majority element always exists in the array.

    // Example 1:
    
    // Input: nums = [3,2,3]
    // Output: 3
    // Example 2:
    
    // Input: nums = [2,2,1,1,1,2,2]
    // Output: 2
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int lowest = prices[0];

        if (prices.length <= 1) {
            return 0;
        }

        for (int i = 1; i <= prices.length - 1; i++) {
            if (prices[i - 1] <= lowest) {
                lowest = prices[i - 1];
            }
            
            int diff = prices[i] - lowest;

            if (diff >= maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimetoBuyandSellStock algo = new BestTimetoBuyandSellStock();
        algo.maxProfit(prices);
    }
}
