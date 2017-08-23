package com.example.JavaAlg;

import java.util.Arrays;

public class PlatformsNeeded {
	private float[] arrivals, departures;

	public static int findPlatforms(float[] arrives, float[] departs, int sizeOfArray) {
		Arrays.sort(arrives);
		Arrays.sort(departs);
		int iArrivals = 1;
		int jDeparts = 0;
		int platform = 1;
		int result = 1;

		while (iArrivals < sizeOfArray && jDeparts < sizeOfArray) {

			if (arrives[iArrivals] > departs[jDeparts]) {
				platform--;
				jDeparts++;
			} else {
				platform++;
				iArrivals++;

			}
			if (platform > result) {
				result = platform;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		float[] arrives = { 900, 940, 950, 1100, 1500, 1800 };
		float[] departs = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println(findPlatforms(arrives, departs, arrives.length));
	}

}
