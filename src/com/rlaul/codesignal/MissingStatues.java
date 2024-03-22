package com.rlaul.codesignal;


import java.util.Arrays;
/*
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. 
 * Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the 
 * previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of 
 * additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
 */
public class MissingStatues {

	public static void main(String[] args) {
		int[] statues = {6,2,3,8};
		System.out.println(solution(statues));
		
	}
	
	static int solution(int[] statues) {
	    if(statues.length == 1)
	        return 0; 
	    int missingStatues = 0;
	    Arrays.sort(statues);
	    for(int i=0;i<statues.length-1;i++){
	        missingStatues+= statues[i+1] - statues[i] -1; 
	    }

	    return missingStatues;
	}


}
