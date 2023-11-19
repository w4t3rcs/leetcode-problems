package org.w4t3rcs.leetcode.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '\t') return counter;
            counter++;
        }


        return counter;
    }
}
