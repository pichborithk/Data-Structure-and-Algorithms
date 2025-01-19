package ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Link: https://leetcode.com/problems/two-sum/description
     */

    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];

            if (map.containsKey(numToFind)) {
                return new int[]{map.get(numToFind), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
