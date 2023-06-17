package org.example.Arrays;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty()) return 0;
        int totalSteps =0;
        for (int i = 0; i < A.size()-1; i++) {
            int minSteps = Math.max(Math.abs(A.get(i)-A.get(i+1)), Math.abs(B.get(i)-B.get(i+1)));
            totalSteps += minSteps;
        }
        return totalSteps;
    }
}
