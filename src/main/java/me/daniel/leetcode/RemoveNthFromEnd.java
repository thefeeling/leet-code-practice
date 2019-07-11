package me.daniel.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RemoveNthFromEnd {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode curr = head;
        List<ListNode> nodeList = new ArrayList<>();
        while (true) {
            nodeList.add(curr);
            if (curr.next == null) break;
            curr = curr.next;
        }
        if (nodeList.size() < n) return head;
        nodeList.remove(nodeList.size() - n);
        if (nodeList.size() == 0) return null;
        ListNode result = nodeList
            .stream()
            .reduce((o1, o2) -> {
                o1.next = o2;
                return o2;
            })
            .orElse(head);
        result.next = null;
        return nodeList.get(0);
    }
}
