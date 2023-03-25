package org.example.binarySearch;

public class CapacityToShipPackagesInB_Days {

    public static int minShipSize(int[] A, int B){
        int max = Integer.MIN_VALUE;
        int totalWeight = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i]>max) max = A[i];
            totalWeight += A[i];
        }

        if(B ==1) return totalWeight;
        else if(B == A.length) return max;

        int s = max, e = totalWeight, result =Integer.MAX_VALUE;
        while(s<=e){
            int expectedMaxWeight = s+((e-s)/2);
            int DaysRequired = calculateDaysToShip(A, expectedMaxWeight);

            if(DaysRequired == B){
                result = Math.min(result, expectedMaxWeight);
                e = expectedMaxWeight-1;
            }
            else if(DaysRequired > B) s = expectedMaxWeight+1;
            else e = expectedMaxWeight-1;
        }
        return s;

    }

    public static int calculateDaysToShip(int[] A, int weight){
        int Days = 1, sum =0;
        for (int i = 0; i < A.length ; i++) {
            if(sum+A[i]> weight){
                sum = A[i];
                Days++;
            } else sum += A[i];
        }
        return Days;
    }

    public static void main(String[] args) {
            int[] A = {10,50,100,100,50,100,100,100};
        System.out.println(minShipSize(A, 5));
    }
}
