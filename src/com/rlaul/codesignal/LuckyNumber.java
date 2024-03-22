package com.rlaul.codesignal;


/**
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.
 * @author rohit
 *
 */
public class LuckyNumber {

	public static void main(String[] args) {
		System.out.println(solution(239017));
	}
	
	static boolean solution(int n) {
	    Integer num = n;
	    String numStr = num.toString();
	    int numLength = numStr.length();
	    int leftSum = 0;
	    int rightSum = 0;
	    
	    if(numLength %2 !=0 )
	        return false;
	        
	    for (int i=0, j=numLength-1;i<numLength/2;i++, j--){
	        int leftHalfNum = numStr.charAt(i);
	        leftSum+=leftHalfNum;
	        int rightHalfNum = numStr.charAt(j);
	        rightSum+=rightHalfNum;
	    }
	    
	    return leftSum==rightSum;
	}


}
