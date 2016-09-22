import java.util.Arrays;

/**
 * Created by svishnu on 6/28/16.
 */
public class TestSolution {
    public static void main(String[] args) {
        int[] nums1 = {1},nums2 = {1,1};
        ArrayIntercetion at = new ArrayIntercetion();
        nums2 = at.intersection(nums1,nums2);
        System.out.println(Arrays.toString(nums2));
    }
    }
