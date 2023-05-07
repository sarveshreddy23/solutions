package org.example.Arrays;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profitSoFar =0;
        int prevPrice =prices[0];

        for (int i = 1; i < prices.length; i++) {
            profitSoFar += (prices[i] > prevPrice) ? prices[i] - prevPrice : 0;
            prevPrice = prices[i];
        }
        return profitSoFar;
    }
}
