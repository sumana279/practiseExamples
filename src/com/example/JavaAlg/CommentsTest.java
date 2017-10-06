package com.example.JavaAlg;

import java.util.HashMap;

public class CommentsTest {
	public void readComments(String str) {
		Boolean commentPresnt = false;
		int cnt = str.length();
		while (cnt != 0) {
			if (str.contains("/*") || (str.contains("//"))) {
				commentPresnt = true;
			}
			cnt--;
		}
		if (commentPresnt) {
			System.out.println(str);
		}

		return;
	}

	public static void main(String[] args) {
		String myStr = "public static void main(String[] args) {// Scanner sc = new Scanner(System.in).;/*test for best*/int height = 10;for (int i = 0; i < height; i++) {for (int j = 0; j <= i; j++) {if (height - (i + j) > 0) {} else {;}";
		CommentsTest cm = new CommentsTest();
		cm.readComments(myStr);
	}

}
