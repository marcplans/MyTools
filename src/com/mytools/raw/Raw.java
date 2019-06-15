package com.mytools.raw;

import java.util.Arrays;
import java.util.List;

public class Raw {

	public static void main(String[] args) {
		foreachLambdaAndMethodAsArgument();
//		getMemAddress();

	}

	// memory address
	private static void getMemAddress() {
		String myString = "Hello world!";
		System.out.println(myString);
		System.out.println(myString.getClass().getName() + "@"
			+ Integer.toHexString(System.identityHashCode(myString)));
	}

	// foreach and lambda and method as argument
	private static void foreachLambdaAndMethodAsArgument() {
		List<Integer> myList = Arrays.asList(7, 2, 4, 8, 1, 3, 9, 5,
			6);
		System.out.println(myList);
		System.out.println();
		myList.forEach(System.out::println);
		System.out.println();
		myList.forEach(Raw::powerTwo);
		System.out.println();
		myList.forEach(item -> {
			System.out.println(Math.pow(item, 2));
			System.out.println("***");
		});
	}

	private static double powerTwo(Integer toRaise) {
		double output = Math.pow(toRaise, 2);
		System.out.println(output);
		return output;
	}

}
