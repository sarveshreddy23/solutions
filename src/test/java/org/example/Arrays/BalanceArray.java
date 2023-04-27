package org.example.Arrays;

import org.junit.Test;
import java.util.ArrayList;

public class BalanceArray {
    public int solve(ArrayList<Integer> A) {
        int len = A.size();
            if(len<=1) return 1;
        int[] prefixSum = new int[len];

        for (int i = len-1; i >=0 ; i--) {
            if(i+2<len) prefixSum[i] += (A.get(i)+prefixSum[i+2]);
            else prefixSum[i] = A.get(i);
        }

        int evenSum =0, oddSum = 0;
        int spclNumbers =0;
        for(int i=0; i<len; i++){
            if(i%2 ==0) {
                if((i+2 < len) ){
                    if( (evenSum + prefixSum[i+1]) == (oddSum+prefixSum[i+2])){
                        spclNumbers++;
                    }
                } else if((i+1 < len)){
                    if((evenSum + prefixSum[i+1]) == (oddSum)){
                        spclNumbers++;
                    }
                }else if(i == len-1 && evenSum == oddSum) {
                    spclNumbers++;
                }

                evenSum += A.get(i);
            }
            else {
                if((i+2 < len) ){
                    if((oddSum + prefixSum[i+1]) == (evenSum+prefixSum[i+2])){
                        spclNumbers++;
                    }

                } else if((i+1 < len) ){
                    if((oddSum + prefixSum[i+1]) == (evenSum)){
                        spclNumbers++;
                    }

                }else if(i == len-1 && evenSum == oddSum) {
                    spclNumbers++;
                }
                oddSum += A.get(i);
            }
        }
        return spclNumbers;
    }


    public int waysToMakeFair(int[] nums) {
        int len = nums.length;
        if(len<=1) return 1;
        int[] prefixSum = new int[len];

        for (int i = len-1; i >=0 ; i--) {
            if(i+2<len) prefixSum[i] += (nums[i]+prefixSum[i+2]);
            else prefixSum[i] = nums[i];
        }

        int evenSum =0, oddSum = 0;
        int spclNumbers =0;
        for(int i=0; i<len; i++){
            if(i%2 ==0) {
                if((i+2 < len) ){
                    if( (evenSum + prefixSum[i+1]) == (oddSum+prefixSum[i+2])){
                        spclNumbers++;
                    }
                } else if((i+1 < len)){
                    if((evenSum + prefixSum[i+1]) == (oddSum)){
                        spclNumbers++;
                    }
                }else if(i == len-1 && evenSum == oddSum) {
                    spclNumbers++;
                }

                evenSum += nums[i];
            }
            else {
                if((i+2 < len) ){
                    if((oddSum + prefixSum[i+1]) == (evenSum+prefixSum[i+2])){
                        spclNumbers++;
                    }

                } else if((i+1 < len) ){
                    if((oddSum + prefixSum[i+1]) == (evenSum)){
                        spclNumbers++;
                    }

                }else if(i == len-1 && evenSum == oddSum) {
                    spclNumbers++;
                }
                oddSum += nums[i];
            }
        }
        return spclNumbers;
    }


    @Test
    public void runTest(){
        ArrayList<Integer> A = new ArrayList<Integer>();
//        A.add(2);
//        A.add(8);
//        A.add(2);
//        A.add(2);
//        A.add(6);
//        A.add(3);


//        A.add(8);
//        A.add(5);

        A.add(9);
        A.add(9);
        A.add(3);
        A.add(5);
        A.add(6);
        System.out.println(solve(A));

    }
}


