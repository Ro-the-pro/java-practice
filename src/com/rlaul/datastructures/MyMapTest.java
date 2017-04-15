package com.rlaul.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyMapTest {


	@Test
	public void testStandardMap() {
		// Standard Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 1);
		map.put("key1", 2);
		map.put("key1", 1);
		assertEquals(map.get("key1"), (Integer) 1);

		for (int i = 0; i < 100; i++) {
			map.put(String.valueOf(i), i);
		}
		assertEquals(map.size(), 101);
		assertEquals(map.get("51"), (Integer) 51);
		
		map.remove("key1");
		assertNull(map.get("key1"));
		
		assertEquals(map.get("1"), (Integer) 1);
		assertEquals(map.size(), 100);

		for (int i = 101; i < 20000; i++) {
			map.put(String.valueOf(i), i);
		}

		// Lets look at the runtime
		long startTime = System.currentTimeMillis();
		for (String s : map.keySet()) {
			map.get(s);
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("testStandardMap:"+elapsedTime);

	}

	@Test
	public void testMyMap() {

		// MyMap
		MyMap<String, Integer> myMap = new MyMap<String, Integer>();
		myMap.put("key1", 1);
		myMap.put("key1", 2);
		myMap.put("key1", 1);
		assertEquals(myMap.get("key1"), (Integer)1);
		for (int i = 0; i < 100; i++) {
			myMap.put(String.valueOf(i), i);
		}
		assertEquals(myMap.size(), 101);
		assertEquals(myMap.get("51"), (Integer) 51);

		myMap.remove("key1");
		assertNull(myMap.get("key1"));
		
		assertEquals(myMap.get("1"), (Integer) 1);
		assertEquals(myMap.size(), 100);

		for (int i = 101; i < 20000; i++) {
			myMap.put(String.valueOf(i), i);
		}

		// Lets look at the runtime
		long startTime = System.currentTimeMillis();
		for (String s : myMap.keySet()) {
			myMap.get(s);
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("testMyMap:"+elapsedTime);
	}
}