package org.example.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumOnesAfterModification {
    public int solve(ArrayList<Integer> A, int B) {
        int ans =0, l =0, r =0;
        while (r<A.size()){
            if(A.get(r) ==0) B--;
            while(B<0){
                if(A.get(l) ==0) B++;
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }



    public int longestOnes(int[] nums, int k) {
        int ans =0, l =0, r =0;
        while (r<nums.length){
            if(nums[r] ==0) k--;
            while(k<0){
                if(nums[l] ==0) k++;
                l++;
            }
            ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }







    @Test
    public void runTest(){
//        Integer[] A = {1, 0, 0, 1, 0, 1, 0, 1, 0, 1};

        Integer[] A ={0,0,1,1,1,0,0};

        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(A));

        System.out.println("Solve: "+solve(lst,1));
    }
}
