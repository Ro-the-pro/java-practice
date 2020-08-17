package com.rlaul.leetcode.easy;

/*
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. Since 
 * each version is developed based on the previous version, all the versions after 
 * a bad version are also bad. Suppose you have n versions [1, 2, ..., n] and you want 
 * to find out the first bad one, which causes all the following ones to be bad. You 
 * are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FindBadVersion {

  public int firstBadVersion(int n) {
      
      int left = 1; 
      int right = n;
      int mid = 1;
      while(right>left){
          mid = left + (right-left)/2;
          if (isBadVersion(mid)){
              right = mid;
          } 
          else{
              left = mid+1;
          }
      }
      return mid;
      
  }

	private boolean isBadVersion(int mid) {
		//This is only added to compile. No logic added.
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
