package com.mytools;

import java.util.ArrayList;

public class MyMath {

	// Rounds given number to closest divisor by ten
	public static int roundToClosestTenDivisor(double num) {
		int output = (int) Math.round(num);
		int a = output / 10 * 10;
		int b = a + 10;
		return (output - a < b - output) ? a : b;
	}

	// Rounds double number with a given decimal precision
	public static double myRound(double numToRound,
			int decimalPlaces) {
		double prec = Math.pow(10, decimalPlaces);
		double roundedNum = Math.round(numToRound * prec) / prec;
		return roundedNum;
	}
	
	// Returns a list of prime numbers, from 2 to given int limit
	public static ArrayList<Integer> getPrimeNums(int limit) {
		ArrayList<Integer> primeNumsArrayList = new ArrayList<Integer>();
		for (int i = 0; i < limit; i++) {
			if (i == 2) {
				primeNumsArrayList.add(i);
			} else if (i > 2) {
				boolean add = true;
				for (int j = 0; j < primeNumsArrayList.size(); j++) {
					if (i % primeNumsArrayList.get(j) == 0) {
						add = false;
						break;
					}
				}
				if (add) {
					primeNumsArrayList.add(i);
				}
			}
		}
		return primeNumsArrayList;
	}
	
	
	
	
	
	
}
