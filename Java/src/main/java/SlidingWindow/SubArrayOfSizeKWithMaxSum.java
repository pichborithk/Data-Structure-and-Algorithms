package SlidingWindow;

import java.util.Arrays;

public class SubArrayOfSizeKWithMaxSum {
    /*
    Given an array of integers of size N and a number K. Return a sub-array of size K with maximum sum.
    Similar problem: https://medium.com/@chsiri469/gfg-max-sum-subarray-of-size-k-f78a059801d3
     */

    public int[] solution(int[] numbers, int k) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += numbers[i];
        }

        int startIndex = 0;
        int maxSum = currentSum;
        for (int i = 1; i < numbers.length - k + 1; i++) {
            currentSum = currentSum - numbers[i - 1] + numbers[i + k - 1];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i;
            }
        }

        return Arrays.copyOfRange(numbers, startIndex, startIndex + k);
    }
}
