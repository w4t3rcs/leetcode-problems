package org.w4t3rcs.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(7));

        System.out.println(getRow(5));
    }

    public static List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1).get(rowIndex);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = generateTriangle(numRows);
        if (numRows <= 2) return generateTriangle(numRows);

        int previousIndex = 1;
        for (int i = previousIndex + 1; i < numRows; i++) {
            List<Integer> previousRow = triangle.get(previousIndex);
            List<Integer> currentRow = triangle.get(i);

            for (int j = 0; j < previousRow.size() - 1; j++) {
                Integer first = previousRow.get(j);
                Integer second = previousRow.get(j + 1);
                currentRow.set(j + 1, first + second);
            }

            previousIndex++;
        }

        return triangle;
    }

    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>(i);
            for (int j = 0; j <= i; j++) {
                currentRow.add(1);
            }
            triangle.add(currentRow);
        }

        return triangle;
    }
}
