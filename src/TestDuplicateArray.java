/**
 * Created by svishnu on 7/20/16.
 */
public class TestDuplicateArray {

    public static void main(String[] args) {
        int[] array1 = {9, 7, 8, 5, 4, 6, 2, 3, 1};
        int[] array2 = {2, 3, 4, 9, 1, 8, 5, 6};
        DuplicateArrayData dd = new DuplicateArrayData();
        System.out.println(dd.missingNumberInDuplicateArray(array1, array2));

        dd.findMissingNumber(array1, array2);

    }
}
