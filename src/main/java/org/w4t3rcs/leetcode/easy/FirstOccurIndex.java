package org.w4t3rcs.leetcode.easy;

public class FirstOccurIndex {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetscode", "leeto"));
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i=0; i <= haystack.length() - needle.length(); i++){
            int j = 0;
            while(j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if(j == needle.length()){
                return i;
            }
        }

        return -1;
    }
}
