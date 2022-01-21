package com.rlaul.datastructures.practice;

public class SimpleBinarySearch {
	
	static int numberofTries = 0;
	public static int binarySearch (int[] nums, int left, int right, int target ) {
		
		numberofTries++;
		if(nums.length==0)
			return -1;
		if (right >= left) {
			int mid = left + (right - left)/2;
			if (nums[mid] == target) {
				return mid;
			}
			
			if (nums[mid] > target) {
				return binarySearch(nums, left, mid-1, target);
			}
			else {
				return binarySearch(nums, mid+1, right, target);
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 6;
		int index = binarySearch(arr, 0, arr.length-1, target);
		if (index == -1)
			System.out.println("number not found");
		else
			System.out.println("index:"+index+" , number of tries:"+numberofTries);
		
	}

}
