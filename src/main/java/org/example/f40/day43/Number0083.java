package org.example.f40.day43;

import org.example.ListNode;

public class Number0083 {
    public static void main(String[] args) {
        ListNode head = ListNode.genList(1,1,2);
        Number0083 t = new Number0083();
        ListNode deleteDuplicates = t.deleteDuplicates(head);
        ListNode.printList(deleteDuplicates);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode slow = head, fast = head;
        
        while (p != null) {
            
        }
        return null;
    }
}
