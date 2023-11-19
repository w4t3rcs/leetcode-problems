package org.w4t3rcs.leetcode.hard;

import java.util.Arrays;

public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double nums1Median = getArrayMedian(nums1);
        double nums2Median = getArrayMedian(nums2);

        if (nums1Median == nums2Median) return nums1Median;
        else if (nums1Median == 0 || nums2Median == 0) {
            if (nums1Median == 0) {
                return nums2Median;
            } else {
                return nums1Median;
            }
        } else {
            return (nums1Median + nums2Median) / 2;
        }
    }

    public double getArrayMedian(int[] source) {
        if (source.length == 0) return 0;
        else if (source.length == 1) return (double) source[0];
        else {
            int first = source[0];
            int last = source[source.length - 1];

            return (double) (last + first) / 2;
        }
    }
}
