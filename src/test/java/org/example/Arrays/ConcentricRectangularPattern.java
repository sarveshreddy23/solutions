package org.example.Arrays;

public class ConcentricRectangularPattern {
    public static int[][] prettyPrint(int A) {
        int arrLen = A*2-1;
        int[][] result = new int[arrLen][arrLen];
        int rows = A*2-1;
        int cols = A*2-1;

        for(int i =0; i<arrLen; i++){
            for (int j = 0; j < arrLen; j++) {
                result[i][j]= Math.max(Math.abs(i-arrLen/2), Math.abs(j-arrLen/2))+1;
            }
        }
return result;
    }

    public static void main(String[] args) {
        prettyPrint(3);
    }
}