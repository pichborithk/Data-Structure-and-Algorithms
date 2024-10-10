package TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    private final IsSubsequence problem = new IsSubsequence();

    @Test
    public void caseOne() {
        String s = "abc";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }

    @Test
    public void caseTwo() {
        String s = "axc";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertFalse(actualResult);
    }

    @Test
    public void caseThree() {
        String s = "";
        String t = "ahbgdc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }

    @Test
    public void caseFour() {
        String s = "b";
        String t = "abc";
        boolean actualResult = problem.solution(s, t);
        assertTrue(actualResult);
    }
}