package TwoPointers;

public class TrappingRainWater {

    private int naive(int[] height) {
        int result = 0;

        for (int i = 1; i < height.length - 1; i++) {

            int maxLeft = 0;
            int maxRight = 0;
            int leftIndex = 0;
            int rightIndex = height.length - 1;

            while (leftIndex < i) {
                maxLeft = Math.max(height[leftIndex], maxLeft);
                leftIndex++;
            }

            while (rightIndex > i) {
                maxRight = Math.max(height[rightIndex], maxRight);
                rightIndex--;
            }

            int area = Math.min(maxLeft, maxRight) - height[i];
            if (area > 0) {
                result += area;
            }
        }

        return result;
    }

    private int solution(int[] height) {
        int result = 0;

        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int maxLeft = height[leftIndex];
        int maxRight = height[rightIndex];

        while (leftIndex < rightIndex) {
            if (maxLeft < maxRight) {
                leftIndex++;
                maxLeft = Math.max(maxLeft, height[leftIndex]);
                result += maxLeft - height[leftIndex];
            } else {
                rightIndex--;
                maxRight = Math.max(maxRight, height[rightIndex]);
                result += maxRight - height[rightIndex];
            }
        }

        return result;
    }
}

// Link: https://leetcode.com/problems/trapping-rain-water/description