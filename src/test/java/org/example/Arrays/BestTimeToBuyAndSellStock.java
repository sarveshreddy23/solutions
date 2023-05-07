package org.example.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfilt = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            maxProfilt = Math.max(maxProfilt, prices[i]-minSoFar);
        }
        return maxProfilt;
    }
}
