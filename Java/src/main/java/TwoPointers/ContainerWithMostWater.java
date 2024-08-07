package TwoPointers;

public class ContainerWithMostWater {

    private int solution(int[] height) {
        int maxArea = 0;
        int leftIndex = 0, rightIndex = height.length - 1;

        while (leftIndex < rightIndex) {
            int weight = rightIndex - leftIndex;
            int area = Math.min(height[leftIndex], height[rightIndex]) * weight;
            maxArea = Math.max(maxArea, area);

            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }
}
