package org.example.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {

        int curr =0, p0 =0;
        int p2 = nums.length-1;

        while(curr<p2){
            if(nums[curr] == 0){
                int temp  = nums[curr];
                nums[curr++] = nums[p0];
                nums[p0++] = temp;
            } else if(nums[curr] == 2){
                int temp  = nums[curr];
                nums[curr++] = nums[p2];
                nums[p2++] = temp;
            } else curr++;
        }

    }

}
