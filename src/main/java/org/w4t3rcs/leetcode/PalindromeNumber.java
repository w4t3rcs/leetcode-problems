package org.w4t3rcs.leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        try {
            return x == Integer.parseInt(String.valueOf(stringBuilder.reverse()));
        } catch (Exception ignored) {
            return false;
        }
    }
}
