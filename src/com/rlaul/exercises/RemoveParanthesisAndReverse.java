package com.rlaul.exercises;

public class RemoveParanthesisAndReverse {

	public static void main(String[] args) {
		String input  = "foo(bar)baz";
		System.out.println("Input:"+input);
		
		String result = solution(input);
		System.out.print("Result:"+result);
	}
	
	static String solution(String inputString) {
	    StringBuffer sb = new StringBuffer();

	    for(int i=inputString.length()-1;i>=0;i--){
	        if(inputString.charAt(i) != '(' && inputString.charAt(i) != ')'){
	            sb.append(inputString.charAt(i));
	        }
	    }
	    
	    return sb.toString();
	}


}
