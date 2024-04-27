package org.example.easy;

public class N2807 {
    public static void main(String[] args) {

    }

    private static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p = head;
        while (p.next != null) {
            int a = p.val;
            int b = p.next.val;

            p.next = new ListNode(gcd(a, b), p.next);
            p = p.next.next;
        }
        return head;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }


    static class ListNode {
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



