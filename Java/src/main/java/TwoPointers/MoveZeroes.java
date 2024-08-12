package TwoPointers;

public class MoveZeroes {

    public void solution(int[] nums) {
        int L = 0;
        for (int R = 0; R < nums.length; R++) {
            if (nums[R] != 0) {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
                L++;
            }
        }
    }
}
