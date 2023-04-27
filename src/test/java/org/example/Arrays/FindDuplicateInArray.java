package org.example.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> A) {
         Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.size(); i++) {
            int t = A.get(i);
            if(set.contains(t)) return t;
            set.add(t);
        }
        return -1;
    }
}
