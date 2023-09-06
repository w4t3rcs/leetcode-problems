package org.w4t3rcs.leetcode.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    public static int[] plusOne(int[] digits) {
        int[] result;
        boolean needPlusOne = false;
        int lastElementIndex = digits.length - 1;
        StringBuilder stringBuilder = new StringBuilder();
        digits[lastElementIndex]++;
        for (int i = lastElementIndex; i >= 0; i--) {
            if (needPlusOne) {
                digits[i]++;
                needPlusOne = false;
            }

            if (digits[i] == 10) {
                if (i == 0) {
                    stringBuilder.append(0);
                    digits[i] = 1;
                } else {
                    digits[i] = 0;
                    needPlusOne = true;
                }
            }

            stringBuilder.append(digits[i]);
        }

        String stringResult = String.valueOf(stringBuilder.reverse());
        result = new int[stringResult.length()];
        int numberCharIndexStart = 48;
        for (int i = 0; i < stringResult.length(); i++) {
            result[i] = stringResult.charAt(i) - numberCharIndexStart;
        }

        return result;
    }
}
