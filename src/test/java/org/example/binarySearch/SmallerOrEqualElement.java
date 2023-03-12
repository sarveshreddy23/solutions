package org.example.binarySearch;

public class SmallerOrEqualElement {
        public static int solve(int[] A, int B) {
            int s =0;
            int e = A.length-1;
            while(s<=e && s<A.length && e>=0){
                int mid = s + (e-s)/2;
                if(A[mid] > B) e = mid-1;
                if(A[mid]<=B) s = mid+1;
            }
            System.out.println(s);
            System.out.println(e);
            return s;
        }

    public static void main(String[] args) {
            int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(solve(A, 1));

//        int[] A = {1, 3, 4, 4, 6};
//        System.out.println(solve(A, 4));
    }

    }
