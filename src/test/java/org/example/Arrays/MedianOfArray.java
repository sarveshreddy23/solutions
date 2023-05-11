package org.example.Arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MedianOfArray {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int m = a.size();
        int n = b.size();

        if(n < m) return findMedianSortedArrays(b, a);
        int realMidInMergedArray = (m+n+1)/2;
        int start = 0;
        int end = m;

        while(start<=end){
            int Amid =start+(end-start)/2;
            int Bmid = realMidInMergedArray - Amid;

            int leftA = (Amid > 0) ? a.get(Amid-1) : Integer.MIN_VALUE;
            int leftB = (Bmid > 0) ? b.get(Bmid-1) : Integer.MIN_VALUE;
            int rightA = (Amid <m) ? a.get(Amid) : Integer.MAX_VALUE;
            int rightB = (Bmid<n) ? b.get(Bmid) : Integer.MAX_VALUE;

            if(leftA<=rightB && leftB <=rightA){
                if((m+n)%2 ==0)
                    return (Math.max(leftA,leftB)+ Math.min(rightA, rightB))/2.0;
                return Math.max(leftA, leftB);
            }else if(leftA>rightB) end = Amid-1;
            else start = Amid+1;

        }
        return 0.0;
    }



    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if(n < m) return findMedianSortedArrays(nums2, nums1);
        int realMidInMergedArray = (m+n+1)/2;
        int start = 0;
        int end = m;

        while(start<=end){
            int Amid =start+(end-start)/2;
            int Bmid = realMidInMergedArray - Amid;

            int leftA = (Amid > 0) ? nums1[Amid-1] : Integer.MIN_VALUE;
            int leftB = (Bmid > 0) ? nums2[Bmid-1] : Integer.MIN_VALUE;
            int rightA = (Amid <m) ? nums1[Amid] : Integer.MAX_VALUE;
            int rightB = (Bmid<n) ? nums2[Bmid] : Integer.MAX_VALUE;

            if(leftA<=rightB && leftB <=rightA){
                if((m+n)%2 ==0)
                    return (Math.max(leftA,leftB)+ Math.min(rightA, rightB))/2.0;
                return Math.max(leftA, leftB);
            }else if(leftA>rightB) end = Amid-1;
            else start = Amid+1;

        }
        return 0.0;
    }






    @Test
    public void runtest(){
            int[] a = {1,3};
            int[] b = {2};
        System.out.println(findMedianSortedArrays(a, b));
    }
}

//
//A : [ -50, -41, -40, -19, 5, 21, 28 ]
//        B : [ -50, -21, -10 ]
//
//-50, -50, -41, -40, -21, -19, -10, 5, 21, 28