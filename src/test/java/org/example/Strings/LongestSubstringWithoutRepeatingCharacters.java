package org.example.Strings;

import org.junit.Test;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, st =0;
        int len = s.length();
        Integer[] index = new Integer[128];
        int i =0;
        while(i<len) {
            char ch = s.charAt(i);
            if(index[ch]!=null &&index[ch] >= st && index[ch]<i){
                st = index[ch]+1;
            }
            maxLen = Math.max(maxLen, i-st+1);
            index[ch]= i;
            i++;
        }
        return maxLen;
    }

    @Test
    public void runtest(){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("cdd"));
        System.out.println(lengthOfLongestSubstring("abba"));

    }
}
