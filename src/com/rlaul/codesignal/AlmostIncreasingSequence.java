package com.rlaul.codesignal;

/*
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly
 *  increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. 
Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2
 to get the strictly increasing sequence [1, 3].
 */
public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		
	}
	
	boolean solution(int[] seq) {
	    int size = seq.length;
		if(size < 3)
	        return true;
	    
	    int count = 0;
	    for(int pos=0; pos<size-1;pos++) {
	        if(seq[pos+1] <= seq[pos] )  {
	            count++;
	        }
	        
	        boolean skipNext = pos+2 < size && seq[pos+2] <= seq[pos];
	        boolean skipPrev = pos-1 >=0 && seq[pos+1] <= seq[pos-1];
	        if(skipNext && skipPrev || count >=2) return false;
	    }
	    
	    return true;
	}


}
