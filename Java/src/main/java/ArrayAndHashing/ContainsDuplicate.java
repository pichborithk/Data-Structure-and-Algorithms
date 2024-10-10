package ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    boolean solution(int[] nums) {
        Set<Integer> uniques = new HashSet<>();

        for (int num : nums) {
            if (uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }

        return false;
    }
}

// Link: https://leetcode.com/problems/contains-duplicate/description