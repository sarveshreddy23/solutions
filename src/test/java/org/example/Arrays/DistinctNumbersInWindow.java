package org.example.Arrays;

import org.junit.Test;

import java.util.HashMap;

public class DistinctNumbersInWindow {
    public int[] dNums(int[] A, int B) {
        int[] result = new int [A.length-B+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B; i++) {
            map.put(A[i],map.getOrDefault(A[i], 0)+1);
        }
        result[0] = map.size();
        for(int i=B; i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i], 0)+1);
            if(map.get(A[i-B])<=1) map.remove(A[i-B]);
            else map.put(A[i-B], map.get(A[i-B])-1);
            result[i-B+1] = map.size();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    @Test
    public void runtest(){
        int[] A = {1, 2, 1, 3, 4, 3};
        dNums(A, 1);
    }
}
