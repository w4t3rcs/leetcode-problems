package org.w4t3rcs.leetcode.easy;

public class BestTimeToBuy {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int[] profits = new int[prices.length/2];
        int minimum = prices[0], maximum = 0, profitIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minimum > prices[i]) {
                if (maximum != 0) profits[profitIndex++] = maximum - minimum;
                minimum = prices[i];
                maximum = 0;
            } else if (maximum < prices[i]) {
                maximum = prices[i];
            }
        }

        if (maximum != 0) profits[profitIndex] = maximum - minimum;
        int maxProfit = 0;
        for (int profit : profits) {
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
