package org.w4t3rcs.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatingSubstring {
    public int lengthOfLongestSubstring(String string) {
        final Map<Character, Integer> characters = new HashMap<>();
        int result = 0;
        int leftPos = 0;
        for (int cursor = 0; cursor < string.length(); cursor++) {
            char currentChar = string.charAt(cursor);
            if (!characters.containsKey(currentChar) || characters.get(currentChar) < leftPos) {
                characters.put(currentChar, cursor);
                result = Math.max(result, cursor - leftPos + 1);
            } else {
                characters.put(currentChar, cursor);
                leftPos = characters.get(currentChar) + 1;
            }
        }

        return result;
    }
}
