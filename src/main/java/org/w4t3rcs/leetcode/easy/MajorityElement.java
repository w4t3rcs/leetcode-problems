package org.w4t3rcs.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 2}));
        System.out.println(majorityElement(new int[]{2, 1, 3, 5, 7}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        for (int num : nums) {
            if (numberCounter.containsKey(num)) {
                int newValue = numberCounter.get(num) + 1;
                numberCounter.put(num, newValue);
            } else {
                numberCounter.put(num, 1);
            }
        }

        int majorElement = 0, majorElementCount = 0;
        for (Map.Entry<Integer, Integer> entry : numberCounter.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            if (count > majorElementCount && count >= nums.length/2) {
                majorElement = number;
                majorElementCount = count;
            }
        }
        return majorElement;
    }
}
