/**
 * Created by svishnu on 7/20/16.
 */
public class DuplicateArrayData {
    public int missingNumberInDuplicateArray(int[] array1, int[] array2) {
        int result = 0;
        if (array1.length != 0 && array2.length != 0) {

                return minInFirstarray(array1, array2);

        }
        return 0;
    }


    private int minInFirstarray(int[] array1, int[] array2) {
        int sum1 =0;
        for(int i=0;i<array1.length;i++){
            sum1 = sum1 + array1[i];
        }

        for(int j=0;j<array2.length;j++){
            sum1 = sum1 - array2[j];
        }
        return sum1;
    }



    public static void findMissingNumber(int[] array1, int[] array2) {
       int result = array1[0];
     for (int i = 1; i < array1.length ; i++) {
         result = result ^ array1[i];
       }
     for (int i = 0; i < array2.length ; i++) {
         result = result ^ array2[i];
     }
       System.out.println("Missing element = "  + result);
   }
}