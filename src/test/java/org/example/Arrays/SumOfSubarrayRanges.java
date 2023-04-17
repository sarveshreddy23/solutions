package org.example.Arrays;

import org.junit.Test;

public class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            int min = nums[i];
            int max = nums[i];
            for (int j = i; j < len; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                sum += (max-min);
            }
        }
        return sum;
    }


    @Test
    public void runTest(){

        int[] nums = {1,3,3};
//        printsubArrayRanges(nums);
        System.out.println(subArrayRanges(nums));

    }
}
