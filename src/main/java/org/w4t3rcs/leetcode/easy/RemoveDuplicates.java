package org.w4t3rcs.leetcode.easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int currentNumber = -101;
        int cursor = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentNumber == -101) {
                currentNumber = nums[i];
                nums[cursor] = currentNumber;
                cursor++;
                count++;
            } else {
                if (nums[i] != currentNumber) {
                    currentNumber = -101;
                    i--;
                }
            }
        }

        return count;
    }
}
