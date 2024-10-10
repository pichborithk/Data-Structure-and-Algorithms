package TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    private final MoveZeroes problem = new MoveZeroes();

    @Test
    public void caseOne() {
        int[] nums = {0,1,0,3,12};
        int[] expectedResult = {1,3,12,0,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void caseTwo() {
        int[] nums = {0};
        int[] expectedResult = {0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void caseThree() {
        int[] nums = {0,1};
        int[] expectedResult = {1,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }

    @Test
    public void caseFour() {
        int[] nums = {0,0,0};
        int[] expectedResult = {0,0,0};
        problem.solution(nums);
        assertArrayEquals(expectedResult, nums, "Expected: " + Arrays.toString(
            expectedResult) + ", Actual Output: "+ Arrays.toString(nums));
    }
}