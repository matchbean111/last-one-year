package org.example.f40.day43;

import org.example.ListNode;

public class Number0876 {

    public static void main(String[] args) {
        ListNode genList = ListNode.genList(1,2,3,4,5);
        Number0876 t = new Number0876();
        ListNode middleNode = t.middleNode(genList);
        System.out.println(middleNode.val);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return slow.next;
    }
}
