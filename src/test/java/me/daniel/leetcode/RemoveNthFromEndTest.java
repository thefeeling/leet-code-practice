package me.daniel.leetcode;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthFromEndTest {
    @Test
    public void removeNthFromEnd() {
        RemoveNthFromEnd.ListNode head = generateListNode();
        RemoveNthFromEnd.ListNode result = RemoveNthFromEnd.removeNthFromEnd(head, 3);
    }

    @NotNull
    private RemoveNthFromEnd.ListNode generateListNode() {
        RemoveNthFromEnd.ListNode head = new RemoveNthFromEnd.ListNode(1);
        RemoveNthFromEnd.ListNode curr = head;
        for (int i = 2; i <= 5; i++) {
            curr.next = new RemoveNthFromEnd.ListNode(i);
            curr = curr.next;
        }
        return head;
    }
}