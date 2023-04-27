package org.example.Arrays;

import org.junit.Test;

import java.util.*;

public class MaximumSumTriplet {
    public int solve(ArrayList<Integer> A) {
        int[] prefix = new int[A.size()];
        int maxSum = Integer.MIN_VALUE;
        int maxNum = A.get(A.size()-1);
        prefix[A.size()-1] = maxNum;

        for (int i = A.size()-2; i >=0 ; i--) {
            maxNum = Math.max(maxNum, A.get(i));
            prefix[i] = maxNum;
        }

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i]+ " ");
        }
        System.out.println();

        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(A.get(0));
        int left = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            if( A.get(i)<prefix[i] && s.lower(A.get(i))!=null){
                maxSum = Math.max(maxSum, s.lower(A.get(i))+A.get(i)+prefix[i]);
            }
            s.add(A.get(i));

        }

        return maxSum;
    }

    public boolean increasingTriplet(int[] nums) {
        int[] prefix = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        int maxNum = nums[nums.length-1];
        prefix[nums.length-1] = maxNum;

        for (int i = nums.length-2; i >=0 ; i--) {
            maxNum = Math.max(maxNum, nums[i]);
            prefix[i] = maxNum;
        }

        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if( nums[i]<prefix[i] && s.lower(nums[i])!=null){
               return true;
            }
            s.add(nums[i]);

        }

        return false;
    }


    @Test
    public void runtest(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(32592);
        a.add(18763);
        a.add(1656);
        a.add(17411);
        a.add(6360);
        a.add(27625);
        a.add(20538);
        a.add(21549);
        a.add(6484);
        a.add(27596);

        System.out.println(solve(a));
    }
}
