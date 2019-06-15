package com.mytools;

import java.util.ArrayList;
import java.util.List;

public class MyArrays<E> {

	// Returns the sum of all integers in array list
	public static int sumIntegerArrayList(
			ArrayList<Integer> arrayToSum) {
		int output = 0;
		for (int i = 0; i < arrayToSum.size(); i++) {
			output += arrayToSum.get(i);
		}
		return output;
	}

	// Returns given generic list reversed
	public List<E> reverseList(List<E> toReverse) {
		for (int i = 0; i < toReverse.size() / 2; i++) {
			E temp = toReverse.get(i);
			toReverse.set(i, toReverse.get(toReverse.size() - 1 - i));
			toReverse.set(toReverse.size() - 1 - i, temp);
		}
		return toReverse;
	}
	
	// Returns given Object list reversed
	public static List<Object> reverseObjectList(List<Object> toReverse) {
		for (int i = 0; i < toReverse.size() / 2; i++) {
			Object temp = toReverse.get(i);
			toReverse.set(i, toReverse.get(toReverse.size() - 1 - i));
			toReverse.set(toReverse.size() - 1 - i, temp);
		}
		return toReverse;
	}
	
	// Returns given generic array reversed
	public E[] reverseList(E[] toReverse) {
		for (int i = 0; i < toReverse.length / 2; i++) {
			E temp = toReverse[i];
			toReverse[i] = toReverse[toReverse.length - 1 - i];
			toReverse[toReverse.length - 1 - i] = temp;
		}
		return toReverse;
	}
	
		
}


