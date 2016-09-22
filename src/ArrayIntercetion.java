import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by svishnu on 6/28/16.
 */
public class ArrayIntercetion {
    public int[] intersection(int[] nums1, int[] nums2) {
        //int[] result = new int [nums1.length+ nums2.length] ;
        int k=0,j=0;

        HashSet numSet1 = new HashSet();
        HashSet numSet2 = new HashSet();
        HashSet result = new HashSet();


        for(int i =0;i < nums1.length;i++) {
            if(!numSet1.equals(nums1[i])) {
                numSet1.add(nums1[i]);
            }
        }

        for(int i =0;i < nums2.length;i++) {
            if(!numSet1.contains(nums2[i])) {
                numSet2.add(nums2[i]);
            }else{
                result.add(nums2[i]);
                k++;
            }
        }
        int[]  rs = new int[result.size()];

        Iterator<Integer> it = result.iterator();
        while(it.hasNext()){

            rs[j] = it.next();
            j++;
        }

        return rs;
    }
}
