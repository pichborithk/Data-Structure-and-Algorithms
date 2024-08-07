package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    private List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lowIndex = i + 1;
                int highIndex = nums.length - 1;

                while (lowIndex < highIndex) {
                    int sum = nums[i] + nums[lowIndex] + nums[highIndex];

                    if (sum < 0) {
                        lowIndex++;
                    } else if (sum > 0) {
                        highIndex--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[lowIndex],
                                                 nums[highIndex]));
                        int currentLow = nums[lowIndex];
                        int currentHigh = nums[highIndex];

                        while (lowIndex < highIndex && currentLow == nums[lowIndex]) {
                            lowIndex++;
                        }

                        while (lowIndex < highIndex && currentHigh == nums[highIndex]) {
                            highIndex--;
                        }
                    }
                }
            }
        }

        return result;
    }
}