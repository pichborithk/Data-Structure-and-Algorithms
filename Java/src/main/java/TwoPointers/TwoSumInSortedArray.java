package TwoPointers;

public class TwoSumInSortedArray {

    private int[] solution(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{};
    }
}

// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description