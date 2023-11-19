package org.w4t3rcs.leetcode.easy;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011")); //10101
        System.out.println(addBinary("11", "1")); //100
        System.out.println(addBinary("1111", "1111")); //11110
        System.out.println(addBinary("110010", "10111")); //1001001
    }

    public static String addBinary(String a, String b) {
        int capacity = Math.max(a.length(), b.length());
        StringBuilder result = new StringBuilder(capacity);

        StringBuilder reversedA = new StringBuilder(a).reverse();
        StringBuilder reversedB = new StringBuilder(b).reverse();

        StringBuilder max, min;
        if (capacity == reversedA.length()) {
            max = reversedA;
            min = reversedB;
        } else {
            max = reversedB;
            min = reversedA;
        }

        int memorizedNumber = 0;
        int cursor = 0;
        for (; cursor < min.length(); cursor++) {
            char charAtA = min.charAt(cursor);
            char charAtB = max.charAt(cursor);
            char charToAppend;
            if (memorizedNumber == 0) {
                if (charAtA == '1' && charAtB == '1') {
                    memorizedNumber = 1;
                    charToAppend = '0';
                } else if ((charAtA == '1' && charAtB == '0')
                        || (charAtA == '0' && charAtB == '1')) {
                    charToAppend = '1';
                } else {
                    charToAppend = '0';
                }
            } else {
                charToAppend = '1';
                if ((charAtA == '1' && charAtB == '0')
                        || charAtA == '0' && charAtB == '1') {
                    charToAppend = '0';
                }
                else if (charAtA == '0' && charAtB == '0') {
                    memorizedNumber = 0;
                }
            }

            result.append(charToAppend);
        }

        for (; cursor < max.length(); cursor++) {
            char charAtA = max.charAt(cursor);
            char charToAppend;
            if (memorizedNumber == 0) {
                charToAppend = charAtA;
            } else {
                if (charAtA == '0') {
                    charToAppend = '1';
                    memorizedNumber = 0;
                } else {
                    charToAppend = '0';
                }
            }

            result.append(charToAppend);
        }

        if (memorizedNumber == 1) result.append('1');
        return result.reverse().toString();
    }
}
