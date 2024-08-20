package Leetcode_Problems.LeetCode_121;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            min = Math.min(min, prices[i]);

            max = Math.max(max, prices[i] - min);

        }

        return max;
    }
}
