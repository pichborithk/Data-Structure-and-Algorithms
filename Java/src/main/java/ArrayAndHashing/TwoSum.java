package ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private int[] solution(int[] nums, int target) {
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
