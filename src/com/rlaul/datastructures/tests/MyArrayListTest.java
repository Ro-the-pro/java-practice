package com.rlaul.datastructures.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.rlaul.datastructures.MyArrayList;

public class MyArrayListTest {


	@Test
	public void testStandardArrayList() {
		// Standard ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);

		assertEquals(list.get(0), (Integer) (0));

		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		
		assertEquals(list.size(), 101);
		assertEquals(list.get(51), (Integer) 51);
		list.remove(1);
		
		System.out.println("-----------------");
		
		assertEquals(list.get(1), (Integer)2 );
		assertEquals(list.size(), 100);


	}

	@Test
	public void testMyArrayList() {

		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(0);

		assertEquals(list.get(0), (Integer) (0));

		for (int i = 1; i < 101; i++) {
			list.add(i);
		}
		
		assertEquals(list.size(), 101);
		assertEquals(list.get(51), (Integer) 51);
		list.remove(1);
		
		assertEquals(list.get(1), (Integer)2 );
		assertEquals(list.size(), 100);

	}
}