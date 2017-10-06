package com.DataStruc.LinkedList;

import java.util.HashSet;

/**
 * Created by svishnu on 9/14/17.
 */
public class PartitionKSum {
    public static void main(String[] args){
     int[] array = {2, 1, 4, 5, 6};
     HashSet<Integer> hashSet = new HashSet<Integer>();

        int val= findSum(array,hashSet);
     Boolean[] flag = new Boolean[array.length];
     System.out.println(val/3);

     if(val%3 ==0){
         for(int j=0;j<array.length;j++){
             flag[j]= true;
             System.out.println(array[j]);
           int valueInNeed = val%3 - array[j];
           if(hashSet.contains(valueInNeed)){
               hashSet.
           }

         }
     }else{
         System.out.print("False");
     }

    }

    private static int findSum(int[] array,HashSet<Integer> hashSet) {
        int sum=0;
        for(int i:array){
            hashSet.add(i);
          sum = sum + i;

        }
        return sum;
    }
}
