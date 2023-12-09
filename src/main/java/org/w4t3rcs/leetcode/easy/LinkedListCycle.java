package org.w4t3rcs.leetcode.easy;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        ListNode current = head;
        ListNode raceMember = head;
        try {
            while (current.next != null) {
                raceMember = raceMember.next.next.next.next;
                current = current.next;

                if (raceMember.val == current.val) return true;
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
