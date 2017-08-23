package com.example.JavaAlg;

/**
 * Created by svishnu on 8/7/17.
 */
public class PeakElementInArray {
  public static void main(String[] args){
      int[] array = {5,10,15,35,30,45,20,50,35,1};
      System.out.println(findPeakInAnArray(array));
  }
private static int findPeakInAnArray(int[] array) {
    if (array.length < 0) {
        return 0;
    } else {
        int start = 0;
        int end = array.length - 1;
        ;
        int mid = start + end / 2;
        while (start <= end) {
            if (array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
                return array[mid];
            } else if (array[mid] > array[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

           mid = (start +end) /2;
        }
    }
    return 0;
}


}
