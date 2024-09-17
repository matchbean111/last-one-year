package org.example.f40.day42;

import java.util.PriorityQueue;

import org.example.ListNode;

public class Number0023 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(), dummy = ans;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            ans.next = temp;
            if (temp.next != null) {
                pq.offer(temp.next);
            }
            ans = ans.next;
        }
        return dummy.next;  
    }
}