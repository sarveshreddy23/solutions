package org.example.binarySearch;

public class MatrixSearch {
    public static int searchMatrix(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        int len = rows*cols-1;
        int s =0;
        int e = len;
        int r,c;
        while(s<=e){
            int mid = s+((e-s)/2);
            r = mid/cols;
            c = mid%cols;
            if(A[r][c]==B) return 1;
            else if(A[r][c]<B) s = mid+1;
            else e = mid -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] A = {{3},
        {29},
        {36},
        {63},
        {67},
        {72},
        {74},
        {78},
        {85}
    };
        System.out.println(searchMatrix(A,48));
    }

}
