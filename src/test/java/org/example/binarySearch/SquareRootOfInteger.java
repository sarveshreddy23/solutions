package org.example.binarySearch;

public class SquareRootOfInteger {
    public static int getSqrt(int A){
        int min =0;
        int max = A/2;
        if(A==1) return 1;
        while(min <= max){
            int mid = min + ((max-min)/2);
            if((long)mid*mid ==A) return mid;
            else if((long)mid*mid<A) min = mid+1;
            else max = mid-1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getSqrt(930675566));
    }
}
