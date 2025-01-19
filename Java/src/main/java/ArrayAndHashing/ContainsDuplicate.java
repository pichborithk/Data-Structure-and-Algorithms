package ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Link: https://leetcode.com/problems/contains-duplicate/description
     */

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
