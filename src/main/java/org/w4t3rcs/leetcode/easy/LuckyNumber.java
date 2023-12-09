package org.w4t3rcs.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LuckyNumber {
    private final Set<Integer> memorized = new HashSet<>();

    public static void main(String[] args) {
        System.out.println(new LuckyNumber().isHappy(13));
    }

    public boolean isHappy(int n) {
        final String stringValueOfNumber = String.valueOf(n);
        int newN = 0;
        for (int i = 0; i < stringValueOfNumber.length(); i++) {
            int value = Integer.parseInt(String.valueOf(stringValueOfNumber.charAt(i)));
            value *= value;
            newN += value;
        }

        if (newN == 1) {
            return true;
        } else if (this.memorized.contains(newN)) {
            return false;
        } else {
            this.memorized.add(newN);
            return isHappy(newN);
        }
    }
}
