package org.w4t3rcs.leetcode.medium;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers numbers = new AddTwoNumbers();
        numbers.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );

        ListNode addedTwoNumbers = numbers.addTwoNumbers(
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))),
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))
        );
        soutListNode(addedTwoNumbers);
        System.out.println();
        System.out.println(9999 + 99999999);
    }

    public static void soutListNode(ListNode listNode) {
        ListNode iterationNode = listNode;
        while (iterationNode != null) {
            System.out.print(iterationNode.val);
            iterationNode = iterationNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        result.next = new ListNode();
        ListNode resultNext = result.next;
        ListNode left = l1;
        ListNode right = l2;
        int memory = 0;
        while (left != null && right != null) {
            int currentPlus = left.val + right.val;
            if (memory == 1) {
                currentPlus++;
                memory = 0;
            }

            if (currentPlus % 10 == currentPlus) {
                resultNext.val = currentPlus;
            } else {
                resultNext.val = currentPlus - 10;
                memory = 1;
            }

            if (left.next != null || right.next != null) {
                resultNext.next = new ListNode();
                resultNext = resultNext.next;
            }

            left = left.next;
            right = right.next;
        }

        if (left == null && right == null && memory == 1) {
            resultNext.next = new ListNode(1);
        } else if (left != null || right != null){
            this.fill(left, resultNext, memory);
            this.fill(right, resultNext, memory);
        }

        return result.next;
    }

    public void fill(ListNode from, ListNode to, int memorizedTen) {
        int memory = memorizedTen;
        ListNode iterationList = from;
        while (iterationList != null) {
            int currentPlus = iterationList.val;
            if (memory == 1) {
                currentPlus++;
                memory = 0;
            }

            if (currentPlus % 10 == currentPlus) {
                to.val = currentPlus;
            } else {
                to.val = currentPlus - 10;
                memory = 1;
            }

            if (iterationList.next != null) {
                to.next = new ListNode();
                to = to.next;
            }

            iterationList = iterationList.next;
        }

        if (memory == 1 && from != null) {
            to.next = new ListNode(1);
        }
    }
}
