package PrefixString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings problem = new GreatestCommonDivisorOfStrings();

    @Test
    public void caseOne() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expectedResult = "ABC";
        String actualResult = problem.solution(str1,
                                               str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void caseTwo() {
        String str1 = "ABABAB";
        String str2 = "AB";
        String expectedResult = "AB";
        String actualResult = problem.solution(str1,
                                               str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void caseThree() {
        String str1 = "LEET";
        String str2 = "CODE";
        String expectedResult = "";
        String actualResult = problem.solution(str1,
                                               str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void caseFour() {
        String str1 = "ABCDEF";
        String str2 = "ABC";
        String expectedResult = "";
        String actualResult = problem.solution(str1,
                                               str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }
}