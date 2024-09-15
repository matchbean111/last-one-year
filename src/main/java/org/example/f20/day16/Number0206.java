package org.example.f20.day16;

public class Number0206 {
    public static void main(String[] args) {
        Number0206 t = new Number0206();
        ListNode head = new ListNode();
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        ListNode ans = t.reverseList(head);
        while (ans.next!= null)  {
            System.out.println(ans.val);
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
