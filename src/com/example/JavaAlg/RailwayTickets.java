package com.example.JavaAlg;

import java.util.Arrays;
import java.util.Scanner;

public class RailwayTickets {
	int numOfTickets, ticketsToSell;
	int[] ticketsPerBooth;

	public RailwayTickets(int numOfTickets, int ticketsToSell, int[] ticketsPerBooth) {
		this.numOfTickets = numOfTickets;
		this.ticketsToSell = ticketsToSell;
		this.ticketsPerBooth = ticketsPerBooth;
	}

	public int findMaxRevenue() {
		int[] perBooth = this.ticketsPerBooth;
		Arrays.sort(perBooth);
		int i = perBooth.length - 1;
		int revenue = 0;
		while (i >= 0 && this.ticketsToSell != 0) {
			int nxtBooth = 0;
			int currBooth = perBooth[i];
			if (i == 0) {
				nxtBooth = 0;
			} else {
				nxtBooth = perBooth[i - 1];
			}

			int diff = currBooth - nxtBooth;
			while (diff != 0 && this.ticketsToSell != 0) {
				revenue += currBooth;
				currBooth--;
				diff--;
				this.ticketsToSell--;
			}
			i--;
		}
		return revenue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfBooths = 5;
		int ticketsToSell = 20;
		int perBooth[] = new int[numOfBooths];

		for (int i = 0; i < numOfBooths; i++) {
			perBooth[i] = sc.nextInt();
		}
		RailwayTickets rt = new RailwayTickets(numOfBooths, ticketsToSell, perBooth);
		System.out.println("Max Revenue = " + rt.findMaxRevenue());
	}
}