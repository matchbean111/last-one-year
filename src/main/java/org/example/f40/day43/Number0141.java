package org.example.f40.day43;

import org.example.ListNode;

public class Number0141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(0);
        ListNode p3 = new ListNode(4);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p1;
        Number0141 t = new Number0141();
        boolean hasCycle = t.hasCycle(head);
        System.out.println(hasCycle);
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
