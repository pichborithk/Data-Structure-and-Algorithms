package SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAverageSubArrayTest {

    private final MaxAverageSubArray problem = new MaxAverageSubArray();

    @Test
    public void caseOne() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expectedResult = 12.75;
        double actualResult = problem.solution(nums, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void caseTwo() {
        int[] nums = {5};
        int k = 1;
        double expectedResult = 5.0;
        double actualResult = problem.solution(nums, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void caseThree() {
        int[] nums = {0, 4, 0, 3, 2};
        int k = 1;
        double expectedResult = 4.0;
        double actualResult = problem.solution(nums, k);
        assertEquals(expectedResult, actualResult);
    }
}