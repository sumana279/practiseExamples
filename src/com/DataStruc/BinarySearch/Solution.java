package com.DataStruc.BinarySearch;

public class Solution {
	public int maxProduct(String[] words) {
	    if(words.length<2) return 0;

	    int max = 0;

	    int [] flags = new int [words.length];
	    int []lengths =  new int [words.length];

	    for(int i=0;i< words.length;i++)
	    {
	        int num=0;
	        char ca[]= words[i].toCharArray();
	        lengths[i]=words[i].length();
	        for(int j=0;j<ca.length;j++)
	         {
	            num|=1<<(ca[j]-'a');
	         }
	         flags[i]=num;
	    }

	    for(int i=0;i<flags.length;i++)
	    {
	        for(int j=i+1;j<flags.length;j++)
	        {
	            if((flags[i] & flags[j])==0)
	             {
	                 int temp = lengths[i]* lengths[j];
	                 max = temp>max?temp:max;


	             }

	        }
	    }
	    return max;
	}
}
