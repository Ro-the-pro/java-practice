package com.rlaul.datastructures.course.bst;

import java.util.ArrayList;

//Java implementation of recursive Binary Search 
//https://www.geeksforgeeks.org/binary-search/

class SimpleBinarySearch { 
	int numberOfTries = 0;
 
 // Returns index of x if it is present in arr[l..r], else return -1 
 int binarySearch(Integer[] array, int left, int right, int x) 
 { 	 
	 numberOfTries++;
     if (right >= left) { 
         int mid = left + (right - left) / 2; 

         // If the element is present at the middle itself 
         if (array[mid] == x) 
             return mid; 

         // If element is smaller than mid, then 
         // it can only be present in left subarray 
         if (array[mid] > x) 
             return binarySearch(array, left, mid - 1, x); 

         // Else the element can only be present in right subarray 
         return binarySearch(array, mid + 1, right, x); 
     } 

     // We reach here when element is not present in array 
     return -1; 
 } 

 // Driver method to test above 
 public static void main(String args[]) 
 { 
	 SimpleBinarySearch ob = new SimpleBinarySearch(); 
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 int size = 100;
	 
     for (int i=0;i<size;i++) {
    	 list.add(i);
     }
     Integer[] array = new Integer[list.size()];
     array = list.toArray(array);
     
     int searchNumber = 10; 
     int result = ob.binarySearch(array, 0, size - 1, searchNumber); 
     if (result == -1) 
         System.out.println("Element not present"); 
     else
         System.out.println("Element found at index " + result + " in number of tries="+ob.numberOfTries); 
 } 
} 
