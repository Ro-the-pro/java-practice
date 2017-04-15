package com.rlaul.greenbook;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.rlaul.datastructures.MyArrayList;

/**
 * JUNIT test class to test the MyArrayList class and compare the results with OOTB ArrayList. 
 * @author rohit
 *
 */
public class MyListTest {

	@Test
	public void testStandardList() {
		// Standard Map
		List<String> stdList = new ArrayList<>();
		stdList.add("zero");
		stdList.add("1");
		stdList.add("two");
		
		//get test
		assertEquals(stdList.get(2), "two");

		//add test
		for (int i = 3; i < 100; i++) {
			stdList.add(String.valueOf(i));
		}
		assertEquals(stdList.size(), 100);
		assertEquals(stdList.get(99), "99");
		
		//remove test
		assertEquals(stdList.get(1), "1");
		stdList.remove(1);
		System.out.println(stdList);
		assertEquals(stdList.get(1), "two");
		assertEquals(stdList.get(2), "3");
		assertEquals(stdList.size(), 99);
		assertEquals(stdList.get(98), "99");
		
		//add(index, data) test
		stdList.add(1, "one");
		assertEquals(stdList.size(), 100);
		assertEquals(stdList.get(1), "one");
		assertEquals(stdList.get(2), "two");
		
	}
	
	@Test
	public void testMyList() {
		// Standard Map
		MyArrayList<String> myList = new MyArrayList<>();
		myList.add("zero");
		myList.add("1");
		myList.add("two");
		
		//get test
		assertEquals(myList.get(2), "two");

		//add test
		for (int i = 3; i < 100; i++) {
			myList.add(String.valueOf(i));
		}
		assertEquals(myList.size(), 100);
		assertEquals(myList.get(99), "99");
		
		//remove test
		assertEquals(myList.get(1), "1");
		myList.remove(1);
		System.out.println(myList);
		assertEquals(myList.get(1), "two");
		assertEquals(myList.get(2), "3");
		assertEquals(myList.size(), 99);
		assertEquals(myList.get(98), "99");
		
		//add(index, data) test
		myList.add(1, "one");
		assertEquals(myList.size(), 100);
		assertEquals(myList.get(1), "one");
		System.out.println(myList);
		assertEquals(myList.get(2), "two");
		
	}

}
