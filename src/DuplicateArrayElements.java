import java.util.Arrays;

/**
 * Created by svishnu on 7/2/16.
 */
public class DuplicateArrayElements {
    public boolean containsDuplicate(int[] nums) {
        int midArray, startArray = 0;
        Arrays.sort(nums);
        midArray = nums.length / 2;
        while (true) {
            while (startArray != midArray) {
                for (int i = startArray; i < midArray; i++) {
                    if (nums[startArray] == nums[i + 1]) {
                        return true;
                    } else {
                        startArray = startArray + 1;
                    }
                }

                startArray = midArray;
                midArray = nums.length - 1;

            }
            return false;
        }


    }
}
