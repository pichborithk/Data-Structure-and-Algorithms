package ArrayAndHashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum problem = new TwoSum();

    @Test
    public void caseOne() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectResult1 = {0,1};
        int[] expectResult2 = {1, 0};
        int[] actualResult = problem.solution(nums, target);
        assertTrue(
            Arrays.equals(actualResult, expectResult1) || Arrays.equals(actualResult, expectResult2)
        );
    }

    @Test
    public void caseTwo() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectResult1 = {2,1};
        int[] expectResult2 = {1, 2};
        int[] actualResult = problem.solution(nums, target);
        assertTrue(
            Arrays.equals(actualResult, expectResult1) || Arrays.equals(actualResult, expectResult2)
        );
    }
}