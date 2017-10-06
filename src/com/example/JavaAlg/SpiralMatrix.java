package com.example.JavaAlg;

public class SpiralMatrix {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 4, 5, 6, 6 }, { 7, 8, 9, 9 }, { 9, 8, 7, 6 } };
		int rows = 4;
		int columns = 4;
		sprialMatrixImpl(rows, columns, a);
	}

	private static void sprialMatrixImpl(int rows, int columns, int[][] a) {
		int r = 0, c = 0;

		while (r < rows && c < columns) {
			{
				for (int i = c; i < columns; i++) {
					System.out.print(a[r][i]);
					System.out.print(" ");
				}
				r++;

				for (int j = r; j <= rows - 1; j++) {
					System.out.print(a[j][columns - 1]);
					System.out.print(" ");

				}
				c--;

				if (c < columns) {
					for (int i = c - 1; i >= 0; i--) {
						System.out.print(a[r][i]);
						System.out.print(" ");
					}
					c++;
				}
				if (r < rows) {
					for (int i = 0; i <= c; i++) {
						System.out.print(a[r][i]);
						System.out.print(" ");
					}
					r--;
				}
			}
		}
	}
}
