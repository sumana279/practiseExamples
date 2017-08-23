package com.example.JavaAlg;

import java.io.*;
import java.util.*;

public class StariCase {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in).;
		/*test for best*/
		int height = 10;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				if (height - (i + j) > 0) {
					System.out.print("#");
				} else {
					System.out.print("");
				}
			}
			System.out.println(" ");
		}

		System.out.println(" New Set ");

		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= height - i; j++) {

				System.out.print("#");
			}
			System.out.println(" ");
		}
		System.out.println(" New Set 2");

		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("#");
			}
			System.out.println(" ");
		}
		System.out.println(" New Set 3");

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height; j++)

			{
				if ((i + j) > height) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}
}