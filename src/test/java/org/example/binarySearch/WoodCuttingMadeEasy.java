package org.example.binarySearch;

public class WoodCuttingMadeEasy {

    public static int getBladeHeight(int[] A, int B){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(A[i]< min) min = A[i];
            else if(A[i] > max) max = A[i];
        }

        while(min <= max){
            int mid = min + ((max-min)/2);
            long wood = woodExtracted(A,mid);
            System.out.println("loop: min:"+min+" max: "+max+" mid: "+mid+" wood: "+wood);

            if(wood == B) return mid;
            else if(wood < B)  max = mid -1;
            else min = mid+1;
            System.out.println("min:"+min+" max: "+max+" mid: "+mid+" wood: "+wood);
        }
         if(woodExtracted(A, min) >= B) return min;
    else return max;
    }

    public static long woodExtracted(int[]A, int height){
        long woodExtracted = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>=height) woodExtracted += (A[i]-height);
        }
        return woodExtracted;
    }

    public static void main(String[] args) {

        int[] A = {145, 75, 114, 110, 52, 66};
        System.out.println(getBladeHeight(A, 30));
        System.out.println(woodExtracted(A,115));
//        int[] A = {114, 55, 95, 131, 77, 111, 141};
//        System.out.println(getBladeHeight(A, 115));
    }

}
