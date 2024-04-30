package org.example;

public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int min = prices[0];
        int growingProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                growingProfit += (prices[i] - prices[i - 1]);
            }

            int onePath = prices[i] - min;

            if (onePath > growingProfit) {
                maxProfit = onePath;
            } else {
                maxProfit = growingProfit;
            }

            if (prices[i] < min) {
                min = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeBuySellStockII algo = new BestTimeBuySellStockII();
        algo.maxProfit(new int[]{7,1,5,3,6,4});
    }
}
