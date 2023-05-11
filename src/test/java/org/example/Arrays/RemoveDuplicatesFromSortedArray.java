package org.example.Arrays;

import org.junit.Test;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {
        int counter = 0;

        for (int i = 1; i < a.size(); i++) {
                int n = a.get(i);
                int m = a.get(i-1);
            if(m==n){
                a.remove(i);
                i--;}

        }
        a.forEach(System.out::println);
        return counter;
    }

    @Test
    public void runTest(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        System.out.println(removeDuplicates(a));
    }
}
