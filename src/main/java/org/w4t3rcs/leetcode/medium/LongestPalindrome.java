package org.w4t3rcs.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public static void main(String[] args) {
//        System.out.println(checkPalindrome("aba")); //true
//        System.out.println(checkPalindrome("aab")); //false
//        System.out.println(checkPalindrome("ba")); //false
//        System.out.println(checkPalindrome("ababa")); //true
//        System.out.println(checkPalindrome("abab")); //false
//        System.out.println(checkPalindrome("baab")); //true
//        System.out.println(checkPalindrome("acabdkaca")); //false

        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("aacabdkacaa"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        List<String> memorized = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char common = s.charAt(i);
            for (int j = s.length() - 1; j > i; j--) {
                char possibleCommon = s.charAt(j);
                if (common == possibleCommon) {
                    final String possiblePalindrome = s.substring(i, j + 1);
                    if (checkPalindrome(possiblePalindrome)) {
                        memorized.add(possiblePalindrome);
                        break;
                    }
                }
            }
        }

        return !getLongestString(memorized).isBlank() ? getLongestString(memorized) : String.valueOf(s.charAt(0));
    }

    public static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(s.length() - i - 1);
            if (left != right) {
                return false;
            }
        }

        return true;
    }

    public static String getLongestString(List<String> strings) {
        String longest = "";
        for (String str: strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return longest;
    }
}
