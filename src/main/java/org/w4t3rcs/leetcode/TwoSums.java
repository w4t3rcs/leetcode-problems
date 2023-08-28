package org.w4t3rcs.leetcode;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int expectedResult = target;
        for (int i = 0; i < nums.length; i++) {
            expectedResult -= nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == expectedResult) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

            expectedResult += nums[i];
        }

        return result;
    }
}
