package org.example.Queues;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class K_LargestElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        PriorityQueue<Integer> p  = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });


        for (int i = 0; i <A.size(); i++) {
            p.add(A.get(i));
            if(p.size()>B) p.poll();
        }

        p.forEach(System.out::print);
        ArrayList<Integer> r = new ArrayList<Integer>();
        r.addAll(p);
        return r;
    }

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> p  = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            if(p.size()>k) p.poll();
        }
        return p.poll();
    }

    @Test
    public void runTest(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(5);
        a.add(4);
        a.add(8);
        solve(a, 2);
    }
}
