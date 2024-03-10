package com.rlaul.exercises;

/**
 * A 1-interesting polygon is just a square with a side of length 1. An
 * n-interesting polygon is obtained by taking the n - 1-interesting polygon and
 * appending 1-interesting polygons to its rim, side by side. You can see the
 * 1-, 2-, 3- and 4-interesting polygons in the picture below. Example
 * 
 * For n = 2, the output should be solution(n) = 5; For n = 3, the output should
 * be solution(n) = 13. Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [memory limit] 1 GB
 * 
 * [input] integer n
 * 
 * Guaranteed constraints: 1 ≤ n < 104.
 * 
 * [output] integer
 * 
 * The area of the n-interesting polygon.
 * 
 * @author rohit
 *
 */
public class InterestingPolygon {

	public static void main(String[] args) {
		int result = shapeArea(4);

		System.out.println(result);
	}

	/*
	 * n area 1 1, 2 5, 3 13, 4 25
	 * 
	 * 
	 */

	static int shapeArea(int n) {
		if (n == 1) {
			return 1;
		}
		if (n < 1) {
			return 0;
		}
		return (int) (Math.pow(n - 1, 2) + Math.pow(n, 2));
	}

}
