package ArrayAndHashing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    @Test
    public void case1() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        assertTrue(containsDuplicate.solution(new int[]{1, 2, 3, 1}));
    }
}