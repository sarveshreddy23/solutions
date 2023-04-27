package org.example.Arrays;

import org.junit.Test;

import java.util.List;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final List<Integer> A) {
        int maxTillNow = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < A.size(); i++) {
            maxTillNow += A.get(i);
            maxSoFar = Math.max(maxSoFar, maxTillNow);
            if(maxTillNow <0) maxTillNow = 0;
        }
        return maxSoFar;
    }

    public int maxSubArray(int[] nums) {
        int maxTillNow = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxTillNow += nums[i];
            maxSoFar = Math.max(maxSoFar, maxTillNow);
            if(maxTillNow <0) maxTillNow = 0;
        }
        return maxSoFar;
    }

    @Test
    public void runTest(){
    }
}
