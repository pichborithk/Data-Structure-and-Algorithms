package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately problem = new MergeStringsAlternately();

    @Test
    public void caseOne() {
        String word1 = "abc";
        String word2 = "pqr";
        String expectedResult = "apbqcr";
        String actualResult = problem.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void caseTwo() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expectedResult = "apbqrs";
        String actualResult = problem.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void caseThree() {
        String word1 = "abcd";
        String word2 = "pq";
        String expectedResult = "apbqcd";
        String actualResult = problem.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }
}