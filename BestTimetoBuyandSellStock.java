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
        int length = prices.length;
        int maxDiff = 0;
        if (length <= 1) {
            return 0;
        }

        int i = 0, j = 1;
        
        while (i < j && j < length) {
            int diff = calculateProfit(i, j, prices);

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (j < length - 1) {
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }

    public int calculateProfit(int i, int j, int[] prices) {

        if (prices[i] > prices[j]) {
            return 0;
        } else {
            return prices[j] - prices[i];
        }
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimetoBuyandSellStock algo = new BestTimetoBuyandSellStock();
        algo.maxProfit(prices);
    }
}
