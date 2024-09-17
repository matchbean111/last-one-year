package org.example;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * generate a linked list using given integers  
     * @return A linked list
     */
    public static ListNode genList(int...lists) {
        ListNode head = new ListNode(), p = head;
        for (int val : lists) {
            p.next = new ListNode(val);
            p = p.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + ", ");
        }
    } 
}
