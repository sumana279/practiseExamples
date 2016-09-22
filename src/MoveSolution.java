import java.util.Arrays;

/**
 * Created by svishnu on 6/24/16.
 */
public class MoveSolution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int d : nums) {
            if (d != 0) {
                nums[i++] = d;
            }
        }

        Arrays.fill(nums, i, nums.length, 0);
    }
}
