package TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    private final MoveZeroes problem = new MoveZeroes();

    @Test
    public void case1() {
        int[] nums = {0,1,0,3,12};
        int[] expectedResult = {1,3,12,0,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void case2() {
        int[] nums = {0};
        int[] expectedResult = {0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void case3() {
        int[] nums = {0,1};
        int[] expectedResult = {1,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void case4() {
        int[] nums = {0,0,0};
        int[] expectedResult = {0,0,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }
}