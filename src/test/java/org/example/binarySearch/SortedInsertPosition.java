package org.example.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class SortedInsertPosition {
    public static int searchInsert(ArrayList<Integer> a, int b) {
        int s =0;
        int e = a.size()-1;
        int mid =0;
        while(s<=e){
            mid = s+ ((e-s)/2);
            if(a.get(mid) == b) return mid;
            else if(a.get(mid)>b) e = mid-1;
            else s = mid+1;
            System.out.println(s+" : "+e+" : "+mid);
        }
        return s;
    }


    public static int searchInsert_Array(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        int mid =0;
        while(s<=e){
            mid = s+ ((e-s)/2);
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) e = mid-1;
            else s = mid+1;
        }
        return s;
    }


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(6);
        System.out.println(searchInsert(a, 7));
    }
}
