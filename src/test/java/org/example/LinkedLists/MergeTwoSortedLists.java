package org.example.LinkedLists;

import org.junit.Test;

import java.util.ArrayList;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode head = new ListNode();
        ListNode pointer = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode t1 = new ListNode(list1.val);
                pointer.next = t1;
                pointer = pointer.next;
                list1 = list1.next;
            }else {
                ListNode t1 = new ListNode(list2.val);
                pointer.next = t1;
                pointer = pointer.next;
                list2 = list2.next;
            }
        }
        while(list1 !=null){
            ListNode t1 = new ListNode(list1.val);
            pointer.next = t1;
            pointer = pointer.next;
            list1 = list1.next;
        }
        while(list2 !=null){
            ListNode t1 = new ListNode(list2.val);
            pointer.next = t1;
            pointer = pointer.next;
            list2 = list2.next;
        }

    }



    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i =0;
        int j =0;
        int m = a.size();
        int n = b.size();
        while(j<n){
            if(i<m && a.get(i)<b.get(j)) i++;

            else if(i<m){
                a.add(i, b.get(j++));
                m++;
                i++;
            }
            else {
                a.add(b.get(j++));
            }
        }
    }


    @Test
    public void runTest(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(3);
        b.add(-4);
        b.add(-3);
//        b.add(2);

        merge(a, b);
        a.forEach(System.out::println);
    }
}
