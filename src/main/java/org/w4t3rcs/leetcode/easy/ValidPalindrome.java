package org.w4t3rcs.leetcode.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String string) {
        if (string == null) return false;
        string = string.toLowerCase();
        string = string.replaceAll("\\W|_", "");

        String reversed = new StringBuilder(string).reverse().toString();
        return reversed.equals(string);
    }
}
