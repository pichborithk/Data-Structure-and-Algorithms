package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    public void case1() {
        String word1 = "abc";
        String word2 = "pqr";
        String expectedResult = "apbqcr";
        String actualResult = mergeStringsAlternately.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void case2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expectedResult = "apbqrs";
        String actualResult = mergeStringsAlternately.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void case3() {
        String word1 = "abcd";
        String word2 = "pq";
        String expectedResult = "apbqcd";
        String actualResult = mergeStringsAlternately.solution(word1, word2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }
}