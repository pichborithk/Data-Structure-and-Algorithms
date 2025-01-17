package SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayOfSizeKWithMaxSumTest {

    private final SubArrayOfSizeKWithMaxSum problem = new SubArrayOfSizeKWithMaxSum();

    @Test
    public void caseOne() {
        int[] arr = {2, 5, 3, 7, 8, 9, 1, 5};
        int k = 3;
        int[] expectResult = {7, 8, 9};
        int[] actualResult = problem.solution(arr, k);
        assertArrayEquals(expectResult, actualResult);
    }
}