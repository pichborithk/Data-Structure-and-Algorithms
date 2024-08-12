package ArrayAndHashing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    private final ContainsDuplicate problem = new ContainsDuplicate();

    @Test
    public void case1() {
        int[] nums = {1, 2, 3, 1};
        boolean actualResult = problem.solution(nums);
        assertTrue(actualResult);
    }
}