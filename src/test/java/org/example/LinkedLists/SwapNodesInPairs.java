package org.example.LinkedLists;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        ListNode first, second, previous;
        ListNode pointer = head;

        if(head == null) return null;
        if(head.next == null) return head;

        first = head;
        second = head.next;
        first.next = second.next;
        second.next = first;
        head = second;
        previous = first;
        pointer = previous.next;

        while(pointer != null){
            first = pointer;
            if(pointer.next !=null) second = pointer.next;
            first.next = second.next;
            second.next = first;
            previous.next = second;
            previous = first;
            pointer = previous.next;
        }
        return head;
    }
}
