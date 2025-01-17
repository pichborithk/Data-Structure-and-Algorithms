package Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfFibonacciTest {

    private final ArrayOfFibonacci problem = new ArrayOfFibonacci();

    @Test
    public void caseOne() {
        int n = 5;
        long[] expectResult = {0, 1, 1, 2, 3};
        long[] actualResult = problem.solution(n);
        assertArrayEquals(expectResult, actualResult);
    }

    @Test
    public void caseTwo() {
        int n = 7;
        long[] expectResult = {0, 1, 1, 2, 3, 5, 8};
        long[] actualResult = problem.solution(n);
        assertArrayEquals(expectResult, actualResult);
    }
}