package PrefixString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

    @Test
    public void case1() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expectedResult = "ABC";
        String actualResult = greatestCommonDivisorOfStrings.solution(str1,
                                                                      str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void case2() {
        String str1 = "ABABAB";
        String str2 = "AB";
        String expectedResult = "AB";
        String actualResult = greatestCommonDivisorOfStrings.solution(str1,
                                                                      str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void case3() {
        String str1 = "LEET";
        String str2 = "CODE";
        String expectedResult = "";
        String actualResult = greatestCommonDivisorOfStrings.solution(str1,
                                                                      str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }

    @Test
    public void case4() {
        String str1 = "ABCDEF";
        String str2 = "ABC";
        String expectedResult = "";
        String actualResult = greatestCommonDivisorOfStrings.solution(str1,
                                                                      str2);
        assertEquals(expectedResult, actualResult, "Expected: " + expectedResult + ", Actual Output: "+ actualResult);
    }
}