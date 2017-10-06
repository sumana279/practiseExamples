package com.example.JavaAlg;

public class StockSpanTest {

	public static void main(String[] args) {
		StockSpanProb ssp= new StockSpanProb();
		int[] stockRange = {100, 80, 60, 70, 60, 75, 85};
		int [] outPut = new int[stockRange.length];
		ssp.calculateSpan(stockRange, outPut);
		
	}

}
