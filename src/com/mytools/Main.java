package com.mytools;

import java.util.Arrays;
import java.util.List;

import javax.swing.text.PlainDocument;

public class Main {

	public static void main(String[] args) {
		
		
		if (MyString.isAnyStringVoid("   b ", "1" , "       a        " )){
			System.out.println("null or empty string");
		} else {
			System.out.println("not null or empty string");
		}


//		List<Object> myArrayList = Arrays.asList("a", "b", "c", "d", "e" , "f");
//		List<String> myOtherArrayList = Arrays.asList("a", "b", "c", "d", "e" , "f");
//		
//		
//		System.out.println(myArrayList);
//		System.out.println(MyArrays.reverseObjectList(myArrayList));
//		
//		
//		System.out.println();
//		System.out.println(new MyArrays<String>().reverseList(myOtherArrayList));

	}

}
