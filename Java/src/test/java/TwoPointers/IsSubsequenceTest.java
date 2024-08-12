package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private final IsSubsequence problem = new IsSubsequence();

    @Test
    public void case1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }

    @Test
    public void case2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertFalse(actualResult);
    }

    @Test
    public void case3() {
        String s = "";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }

    @Test
    public void case4() {
        String s = "b";
        String t = "abc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }
}