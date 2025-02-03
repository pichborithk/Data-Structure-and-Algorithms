package SlidingWindow;

public class MaxAverageSubArray {

    /*
    You are given an integer array nums consisting of n elements, and an integer k.
    Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
    Any answer with a calculation error less than 10-5 will be accepted.
    Example 1:
        Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    Example 2:
        Input: nums = [5], k = 1
        Output: 5.00000
    Link: https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
    */

    public double solution(int[] nums, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        /*
        for (int i = 1; i < nums.length - k + 1; i++) {
            currentSum = currentSum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(maxSum, currentSum);
        }
        */

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }


        return (double) maxSum / k;
    }
}
