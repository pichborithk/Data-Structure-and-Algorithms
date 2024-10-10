package ArrayAndHashing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    private final ContainsDuplicate problem = new ContainsDuplicate();

    @Test
    public void caseOne() {
        int[] nums = {1, 2, 3, 1};
        boolean actualResult = problem.solution(nums);
        assertTrue(actualResult);
    }

    @Test
    public void caseTwo() {
        int[] nums = {4, 2, 6, 9};
        boolean actualResult = problem.solution(nums);
        assertFalse(actualResult);
    }
}