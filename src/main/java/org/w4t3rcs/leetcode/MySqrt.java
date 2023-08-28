package org.w4t3rcs.leetcode;

public class MySqrt {
    public static int mySqrt(int x) {
        try {
            int start = (x/2) + 1;
            long square;
            boolean speedUsed = false;
            while (x != (square = (long)start*start)) {
                if (square < x) {
                    return start;
                }

                if (!speedUsed) {
                    if (x > 10000000) {
                        speedUsed = true;
                        start /= 1000;
                    } else if (x > 10000) {
                        speedUsed = true;
                        start /= 100;
                    } else {
                        speedUsed = true;
                    }
                }

                start--;
            }

            return start;
        } catch (Exception ignored) {
            return 0;
        }
    }
}
