package com.mytools;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Object> myArrayList = Arrays.asList("a", "b", "c", "d", "e" , "f");
		List<String> myOtherArrayList = Arrays.asList("a", "b", "c", "d", "e" , "f");
		
		
		System.out.println(myArrayList);
		System.out.println(MyArrays.reverseObjectList(myArrayList));
		
		
		System.out.println();
		System.out.println(new MyArrays<String>().reverseList(myOtherArrayList));

	}

}
