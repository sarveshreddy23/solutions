package org.example.binarySearch;

public class SearchForRange {

    public static int[] searchRange(int[] A, int B) {
        int s = 0, e = A.length;
        int startRange = Integer.MAX_VALUE;
        int endRange = Integer.MIN_VALUE;
        int[] range = new int[2];
            range[0] = -1;
            range[1] = -1;

            if(A.length ==0) return range;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(A[mid] == B) {
                startRange = Math.min(mid, startRange);
                e = mid-1;
            }
            else if(A[mid]<B) s = mid+1;
            else e = mid-1;
        }

        if(!(startRange<A.length)){
            range[0] = -1;
            range[1] = -1;
            return range;
        }

         s = startRange;
         e = A.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(A[mid] == B) {
                endRange = Math.max(mid, endRange);
                s = mid+1;
            }
            else if(A[mid]<B) s = mid+1;
            else e = mid-1;
        }
            range[0] = startRange;
            range[1] = endRange;

        return range;

    }

    public static void main(String[] args) {

//        int[] nums = {5,7,7,8,8,10};
        int[] nums = {5};
        int target = 5;

        int[] range = new int[2];

        range = searchRange(nums, target);

        System.out.println(range[0]+" : "+range[1]);

    }
}
