package com.rlaul.exercises;
/**
 * After becoming famous, the CodeBots decided to move into a new building together. 
 * Each of the rooms has a different cost, and some of them are free, but there's a 
 * rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, 
 * they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
 your task is to return the total sum of all rooms that are suitable for the CodeBots 
 (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
solution(matrix) = 9.
 * @author rohit
 *
 */
public class HauntedRoomMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
		int capacity = solution(matrix);
		System.out.println(capacity);
	}

	static int hautedRooms(int[][] matrix) {
		int hauntedRooms = 0;

		for (int i = 0; i < matrix.length; i++) {
			int[] inner = matrix[i];
			for (int j = 0; j < inner.length; j++) {
				if (inner[j] == 0) {
					hauntedRooms++;
				}

			}
		}
		return hauntedRooms;
	}

	static int solution(int[][] matrix) {
		int capacity = 0;

		for (int j = 0; j < matrix[0].length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 0) {
					break;
				} else {
					capacity += matrix[i][j];
				}
			}
		}
		return capacity;
	}

}
