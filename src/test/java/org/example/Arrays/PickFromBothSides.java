package org.example.Arrays;

import java.util.ArrayList;

public class PickFromBothSides {
    public int solve(ArrayList<Integer> A, int B) {
        int maxTotal = Integer.MIN_VALUE;
        int currentTotal = 0;
        int len = A.size();
        for (int i = 0; i < B; i++) {
            currentTotal += A.get(i);
        }
        maxTotal = Math.max(currentTotal, maxTotal);
        for (int i = 0; i < B; i++) {
            currentTotal += (A.get(len-i-1) - A.get(B-1-i));
            maxTotal = Math.max(currentTotal, maxTotal);
        }
        return maxTotal;
    }

    public int maxScore(int[] cardPoints, int k) {
        int maxTotal = Integer.MIN_VALUE;
        int currentTotal = 0;
        int len = cardPoints.length;
        for (int i = 0; i < k; i++) {
            currentTotal += cardPoints[i];
        }
        maxTotal = Math.max(currentTotal, maxTotal);
        for (int i = 0; i < k; i++) {
            currentTotal += (cardPoints[len-i-1] - cardPoints[k-i-1]);
            maxTotal = Math.max(currentTotal, maxTotal);
        }
        return maxTotal;
    }
}
