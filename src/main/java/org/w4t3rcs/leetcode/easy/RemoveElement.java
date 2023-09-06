package org.w4t3rcs.leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int maxPossibleNumber = 51;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = maxPossibleNumber;
            } else {
                length++;
            }
        }

        Arrays.sort(nums);
        nums = Arrays.copyOf(nums, length + 1);
        return length;
    }
}
