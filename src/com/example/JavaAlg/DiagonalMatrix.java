package com.example.JavaAlg;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int[][] array = { { 1,2,3,4 }, { 5,6,7,8 }, { 9,10,11,12}};

		 System.out.println("Reverse Diagonal");
		reverseDiagonal(array, 3, 4);
		 System.out.println("Diagonal");
		diagonalMatrixDisplay(array, 3, 4);
		 System.out.println("Transpose");
         transpose(array, 3, 4);
	}

	private static void diagonalMatrixDisplay(int[][] array, int row, int col) {
		int r = 0;
		int c = 0;
		int colCnt = array[0].length;

		for (int i = 0; i < array.length; i++) {
			for (r = i, c = 0; r >= 0 && c < colCnt; r--, c++) {
				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < colCnt; i++) {
			for (r = array.length - 1, c = i; r >= 0 && c < colCnt; r--, c++) {
				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}
	}

	private static void transpose(int[][] array, int rows, int cols) {
		int r = 0;
		int c = 0;

		for (int i = 0; i <= array.length; i++) {
			for (r = 0,c=i; r < rows && c < cols; r++) {
				System.out.print(array[r][c] + " ");
			}

			System.out.println();
		}

	}
	
	/* 
	 * 2,0
       1,0 2,1
       0,0 1,1 2,2
       
       0,1 1,2 2,3
       0,2 1,3
       0,3

	 * 
	 * */
	
	private static void reverseDiagonal(int[][] array, int row, int col){
		int r = array.length-1;
		int c = 0;
		int colCnt = array[0].length;

		for(int i = 0; i < array.length; i++){
			for(r=i,c=0;r >= 0 && c < col;r--,c++){
				System.out.print(array[array.length-1-r][c] + " ");
			}
			System.out.println();
		}
		
		for(int i = 1; i < colCnt; i++){
			for(r=0,c=i;r < row && c < col;r++,c++){
				System.out.print(array[r][c] + " ");
			}
			System.out.println();
		}
		
	}
}
