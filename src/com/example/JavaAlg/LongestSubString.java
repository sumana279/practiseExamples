package com.example.JavaAlg;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by svishnu on 7/29/17.
 */
public class LongestSubString {

    private int longestSubStr(String str){
        char[] charArray = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        int max =0;
        int start = 0;
        int prev =0;

        for(int c=0;c < charArray.length;c++){
            if(hashSet.isEmpty() || !hashSet.contains(charArray[c])){
                hashSet.add(charArray[c]);
                max = Math.max(max,hashSet.size());
                if(prev != max){
                    System.out.println(" ");
                    System.out.println("New Longest String");
                    for(char o:hashSet){
                        System.out.print(o+ " ");
                    }
                    prev = max;
                }
            }else{
              for(int i=0;i <= c;i++){
                hashSet.remove(charArray[i]);
              }
              hashSet.add(charArray[c]);
            }

        }


        return max;
    }



    public static void main (String[] args){
        LongestSubString lss = new LongestSubString();
        System.out.println(lss.longestSubStr("bbbbbbca"));
    }
}
