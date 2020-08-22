package com.rlaul.datastructures.others;

public class SeparateOddEvenArray {
	
	public int[] segregateArray(int[] arr) {
		
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1; 
        while (left < right) 
        { 
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0) {
                left++; 
            }
  
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1) {
                right--; 
            }
  
            /* Swap arr[left] and arr[right] since arr[left] is odd and arr[right] is even*/
            int temp = arr[left]; 
            arr[left] = arr[right]; 
            arr[right] = temp; 
            left++; 
            right--; 
        } 
		
		return arr;
		
	}

	public static void main(String[] args) {
		SeparateOddEvenArray obj = new SeparateOddEvenArray();
		int[] arr = {12, 10,  17, 70, 15, 22, 65, 21, 90};
		System.out.print("----------Input Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
		}	
		System.out.println();
		int[] resultArr = obj.segregateArray(arr);
		System.out.print("---------Output Array: ");
		for(int i=0;i<resultArr.length;i++) {
			System.out.print(resultArr[i]+" , ");
		}
	}
	

}
