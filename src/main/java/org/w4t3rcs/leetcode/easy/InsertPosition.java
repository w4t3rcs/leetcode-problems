package org.w4t3rcs.leetcode.easy;

public class InsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{3, 6, 7, 8, 10}, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int leftPos = 0, rightPos = nums.length - 1;
        if (target > nums[rightPos]) return rightPos + 1;
        else if (target < nums[leftPos]) return leftPos;
        while (rightPos >= leftPos) {
            int midPos = (rightPos + leftPos) / 2;
            int guess = nums[midPos];
            if (guess == target) return midPos;
            else if (guess > target) {
                rightPos = midPos - 1;
            } else {
                leftPos = midPos + 1;
            }
        }

        System.gc();
        return leftPos;
    }
}
