package org.example.binarySearch;

import java.util.ArrayList;

public class PaintersPartitionProblem {
    public static int paint(int A, int B, int[] C) {
        long maxTime = Long.MIN_VALUE;
        long totalTime = 0;
        for (int i = 0; i < C.length; i++) {
             maxTime = Math.max(maxTime, (long)B*C[i]);
             totalTime += (long)B*C[i];
        }

        if(A ==1) return (int) (totalTime%(long)10000003);

        long resultTime = totalTime;
        long s = maxTime, e = totalTime;
        while(s<=e){
            long mid = s + (e-s)/2;
            int painters = calculatePaintersNeededForTime(A, B, C, mid);

            if(painters <= A){
                resultTime = Math.min(resultTime, mid);
                        e = mid -1;
            } else {
                s = mid +1;
            }

        }
        return (int)(resultTime % 10000003);
    }

    public static int calculatePaintersNeededForTime(int A, int B, int[] C, long time){
            int painters = 1;
            long cumulativeTime = 0;
        for (int i = 0; i < C.length; i++) {
            if(B*C[i]+cumulativeTime <= time) cumulativeTime += (B*C[i]);
            else {
                painters++;
                cumulativeTime = (B*C[i]);
            }
        }
        return painters;
    }
    public static void main(String[] args) {
//        int  A = 2;
//         int B = 5;
//        int[] C = {1, 10};
//        int  A = 10;
//         int B = 1;
//        int[] C = {1, 8, 11, 3};
        int  A = 1;
        int B = 1000000;
        int[] C = {1000000, 1000000};
        System.out.println(paint(A, B, C));
    }
}
