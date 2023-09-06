package org.w4t3rcs.leetcode.easy;

public class ReverseInteger {
    public static int reverse(int x) {
        StringBuilder reverse = new StringBuilder(String.valueOf(x)).reverse();
        if (reverse.charAt(reverse.length() - 1) == '-') {
            reverse.deleteCharAt(reverse.length() - 1);
            reverse.insert(0, '-');
        }

        int reversedInt = 0;
        try {
            reversedInt = Integer.parseInt(String.valueOf(reverse));
        } catch (NumberFormatException ignored) {
        }
        return reversedInt;
    }
}
