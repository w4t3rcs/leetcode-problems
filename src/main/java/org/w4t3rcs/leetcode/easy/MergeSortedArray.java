package org.w4t3rcs.leetcode.easy;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int leftCursor = 0, rightCursor = 0, currentCursor = 0;
        while ((m - leftCursor) != 0 && (n - rightCursor) != 0) {
            if (nums1[leftCursor] < nums2[rightCursor]) {
                merged[currentCursor] = nums1[leftCursor];
                currentCursor++;
                leftCursor++;
            } else {
                merged[currentCursor] = nums2[rightCursor];
                currentCursor++;
                rightCursor++;
            }
        }

        while ((m - leftCursor) != 0) {
            merged[currentCursor] = nums1[leftCursor];
            currentCursor++;
            leftCursor++;
        }

        while ((n - rightCursor) != 0) {
            merged[currentCursor] = nums2[rightCursor];
            currentCursor++;
            rightCursor++;
        }

        System.arraycopy(merged, 0, nums1, 0, nums1.length);
    }
}
