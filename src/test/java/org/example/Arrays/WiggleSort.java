package org.example.Arrays;

import java.util.Arrays;

public class WiggleSort {

    public void wiggleSort(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len-1; i++) {
            if(i%2==0 && nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            } else if(i%2 != 0 && nums[i]<nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }


    public void wiggleSort2(int[] nums) {
        int len = nums.length;

        int[] vals = Arrays.copyOf(nums, len);
        Arrays.sort(vals);

        int pointer = len-1;

        for (int i = 1; i < len; i=i+2) nums[i] = vals[pointer--];

        for (int i = 0; i < len; i=i+2) nums[i] = vals[pointer--];

    }


}

