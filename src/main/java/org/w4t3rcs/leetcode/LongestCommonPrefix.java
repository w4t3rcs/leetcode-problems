package org.w4t3rcs.leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (int charIndex = 0; charIndex < strings[0].length(); charIndex++) {
                char tempChar = strings[0].charAt(charIndex);
                int stringHavePrefix = 1;
                for (int stringIndex = 1; stringIndex < strings.length; stringIndex++) {
                    if (strings[stringIndex].charAt(charIndex) == tempChar) {
                        stringHavePrefix++;
                    }
                }

                if (stringHavePrefix == strings.length) {
                    stringBuilder.append(tempChar);
                } else break;
            }
        } catch (Exception e) {
            return String.valueOf(stringBuilder);
        }

        return String.valueOf(stringBuilder);
    }
}
