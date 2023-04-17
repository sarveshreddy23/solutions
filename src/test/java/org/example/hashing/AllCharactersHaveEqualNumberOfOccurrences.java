package org.example.hashing;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int occurance = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != occurance) return false;
        }
        return true;
    }

    public boolean areOccurencesEqual(String s) {
        int[] store = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            store[ch]++;
        }

        int occurance = store[s.charAt(0)];
        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
            if(store[i]!= 0 && store[i]!=occurance) return false;
        }
        return true;
    }

    @Test
    public void runTest(){
        System.out.println(areOccurencesEqual("abacbc"));
    }
}
