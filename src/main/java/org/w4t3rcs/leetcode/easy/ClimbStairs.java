package org.w4t3rcs.leetcode.easy;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(2));
    }

    public int climbStairs(int n) {
        //Fibonacci
        if (n <= 0) return 0;
        else if (n == 1) return 1;

        int[] attempts = new int[n];
        attempts[0] = 1;
        attempts[1] = 2;

        for (int i = 2; i < attempts.length; i++) {
            attempts[i] = attempts[i - 1] + attempts[i - 2];
        }

        return attempts[attempts.length - 1];
    }
}
