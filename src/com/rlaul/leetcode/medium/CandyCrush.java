package com.rlaul.leetcode.medium;

/*
 * { 
 * {1, 1, 1, 5}, 
 * {2, 2, 3, },
 * {3, 3, 2}
 * };
 * 
 * 
 */
//Step 1:  Crush Rows

//Step 2: Crush Columns 

//Step 3: Gravity - Remove 0's and move the cells down

//Step 4: Repeat 1,2,3

//Step 5: Return stable

public class CandyCrush {

	public static void main(String[] args) {
		int[][] board = { {1, 1, 1}, {2, 2, 3},{3, 3, 2}};
		
		crush(board);
		print(board);
	}
	
	
	private static void print(int[][] board) {
		System.out.println("{");
		for(int r=0;r<board.length;r++) {
			System.out.print("{");
			for(int c=0;c<board[0].length;c++) {
				System.out.print(board[r][c]+",");
			}
			System.out.print("}\n");
		}
		System.out.print("}");
		
	}


	//crush
	static boolean crush(int[][] board){
		boolean hasCandyCrush = false;
		for (int c=0; c< board[0].length-2; c++) {
			for (int r = 0; r < board.length-2; r++) {
				if(Math.abs(board[r][c])!=0 && Math.abs(board[r][c]) == Math.abs(board[r][c+1])
						&& Math.abs(board[r][c]) == Math.abs(board[r][c+2])) {
					//rows
					hasCandyCrush = true;
					board[r][c] 	= -1 * board[r][c];
					board[r][c+1] 	= -1 * board[r][c+1];
					board[r][c+2]	= -1 * board[r][c+2];
					
					//columns
					if( Math.abs(board[r][c]) == Math.abs(board[r+1][c]) &&
						Math.abs(board[r][c]) == Math.abs(board[r+2][c]) ) {
						board[r+1][c] 	= -1 * board[r+1][c];
						board[r+2][c]	= -1 * board[r+2][c];
					}
				}
			}
		}
		
		//replace all negative with 0
		if(hasCandyCrush)
			for (int c=0; c< board[0].length; c++) {
				for (int r = 0; r < board.length; r++) {
					if (board[r][c]<0) {
						board[r][c] = 0;
					}
				}
			}
		return hasCandyCrush;
		
	}
	
	//WIP
	static void gravitate(int[][] board){
		
		for (int c=0; c< board[0].length; c++) {
			for (int r = 0; r < board.length-2; r++) {
				if(board[r][c]==0 && board[r+1][c]==0 && board[r+2][c]==0) {
					if(r==0) {
						board[r][c] = -1;
					} else {
						int[] temp = {0,0,0};
						//board
						
					}
					
				}
			}
		}
		
	}

}
