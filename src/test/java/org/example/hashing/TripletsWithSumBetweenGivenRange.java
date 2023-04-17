package org.example.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TripletsWithSumBetweenGivenRange {

    public int solve(ArrayList<String> A) {
        Map<Double, Integer> map = new HashMap<Double, Integer>();
            map.put(Double.parseDouble(A.get(0)), 0);
        for (int i = 1; i < A.size()-1; i++) {
            for (int j = i+1; j <A.size() ; j++) {
                Double sum = Double.parseDouble(A.get(i)) + Double.parseDouble(A.get(j));

                if(sum < 2.0){
                    for(Map.Entry<Double, Integer> e : map.entrySet()){
                        if(e.getKey() > 1-sum && e.getKey() < 2-sum) return 1;
                    }

                }
            }
            map.put(Double.parseDouble(A.get(i)), i);
        }
        return 0;
    }

    public int solveBySorting(ArrayList<String> A) {
        ArrayList<Double> list = new ArrayList<>();
        for(String s : A){
            list.add(Double.parseDouble(s));
        }
        Collections.sort(list);

        int i =0;
        int j = list.size()-1;
        while(i-j>=2){
            int m = (i+j)/2;
            Double sum = list.get(i)+list.get(j)+list.get(m);

            if(sum > 2) j--;
            else if(sum <1) i++;
            else return 1;
        }
        return 0;
    }
}
