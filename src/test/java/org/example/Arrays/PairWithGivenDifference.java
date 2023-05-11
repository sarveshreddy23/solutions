package org.example.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenDifference {
    public int solve(ArrayList<Integer> A, int B) {
        Set<Integer> store = new HashSet<Integer>();
            store.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {

            if(store.contains(B-A.get(i))) return 1;
            store.add(A.get(i));
        }
        return 0;
    }
}

