package org.w4t3rcs.leetcode.easy;

public class ValidParentheses {
    public static final char[] opened = {'(', '[', '{'};
    public static final char[] closed = {')', ']', '}'};

    public static void main(String[] args) {
        System.out.println(isValid("{}()"));
        System.out.println(isValid("[)"));
        System.out.println(isValid("{[(}"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("(){}}{"));
        System.out.println(isValid("))"));
    }

    //Slow solution
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) return false;

        boolean isOpened = false;
        int openedIndex = -1, currentIndex = -1, openedCount = 0, wasOpened = 0;
        outer:
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            for (int j = 0; j < opened.length; j++) {
                if (!isOpened) {
                    if (currentChar == opened[j]) {
                        currentIndex = i;
                        openedIndex = j;
                        isOpened = true;
                        wasOpened++;
                        continue outer;
                    }
                } else if (currentChar == opened[j]) {
                    openedCount++;
                    continue outer;
                }
            }

            if (isOpened) {
                if (openedCount != 0) {
                    openedCount--;
                } else {
                    if (currentChar == closed[openedIndex]) {
                        i = currentIndex;
                        isOpened = false;
                    } else {
                        return  false;
                    }
                }
            }
        }

        return wasOpened == s.length() / 2 && !isOpened;
    }
}
