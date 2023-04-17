package org.example.LinkedLists;

public class MergeKSortedLists {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode pointer = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
                pointer = pointer.next;
            }else {
                pointer.next = list2;
                list2 = list2.next;
                pointer = pointer.next;
            }
        }
        pointer.next = (list1 != null) ? list1 : list2;
        return head.next;

    }
        public ListNode mergeKLists(ListNode[] lists) {
            int interval = 1;
            int nodes = lists.length;
            while(interval < nodes){
                for(int i =0; i<nodes-interval; i+= interval*2)
                    lists[i] = mergeTwoLists(lists[i], lists[i+interval]);

                interval *=2;
            }
            return  (nodes > 0) ? lists[0] : null ;
        }


}
