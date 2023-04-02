package org.example.TwoPointers;

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
}
