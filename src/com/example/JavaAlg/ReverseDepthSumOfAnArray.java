package com.example.JavaAlg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseDepthSumOfAnArray {

	public static void main(String[] args) {
		//System.out.println(reverseDepthSum("{1,{4,{6[-i=k}}"));
		String str ="b23c7b39-c02e-4ee3-a2c0-702aba3d307";
		System.out.println(str.toUpperCase());


	}

	public static int reverseDepthSum(String input) {
		// String input = "{{1,1},2,{1,1}}";
		char[] strArray = input.toCharArray();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int depth = 0, maxDepth = 0;

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == '{') {
				depth++;
				if (depth > maxDepth)
					maxDepth = depth;
			} else if (strArray[i] == '}')
				depth--;
			else {
				if (Character.isDigit(strArray[i])) {
					if (map.containsKey(depth))
						map.put(depth, map.get(depth) + Character.getNumericValue(strArray[i]));
					else
						map.put(depth, Character.getNumericValue(strArray[i]));
				} else {
					// "," => no op
				}
			}
		}

		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			result += (maxDepth - entry.getKey() + 1) * entry.getValue();
		}

		return result;
	}



}
