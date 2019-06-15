package com.mytools;

public class MyTime {
	
	// method that delays time a given number of milliseconds
	public static void myDelay(int milliseconds) {
		long initialTime = System.currentTimeMillis();
		while (System.currentTimeMillis() < initialTime
				+ milliseconds) {
		}
	}

}
