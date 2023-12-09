package org.w4t3rcs.leetcode.easy;

import java.util.List;

public class ExcelColumnName {
    public static void main(String[] args) {
//        System.out.println(recursiveConvertToTitle(20));
//        System.out.println(recursiveConvertToTitle(26));
//        System.out.println(recursiveConvertToTitle(27));
        System.out.println(recursiveConvertToTitle(701));
    }

    public static String recursiveConvertToTitle(int columnNumber) {
        return recursiveConvertToTitle(columnNumber, 0, new StringBuilder());
    }

    public static String recursiveConvertToTitle(int columnNumber, int recursiveCount, StringBuilder stringBuilder) {
        final List<String> alphabet = List.of(
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        );
        int index = columnNumber - 1;
        String appendable = "";
        while (index > -1) {
            if (index > alphabet.size() - 1) {
                index -= alphabet.size();
                recursiveConvertToTitle(index + 1, recursiveCount + 1, stringBuilder);
            } else {
                if (recursiveCount > 0) {
                    appendable = alphabet.get(recursiveCount - 1);
                    recursiveCount -= alphabet.size();
                }
                else appendable = alphabet.get(index);
                stringBuilder.append(appendable);
                index = -1;
            }

            System.out.print(appendable);
        }

        // TODO: 26.11.2023
        return stringBuilder.toString();
    }
}
