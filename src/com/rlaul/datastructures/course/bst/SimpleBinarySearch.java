package com.rlaul.datastructures.course.bst;

//Java implementation of recursive Binary Search 
//https://www.geeksforgeeks.org/binary-search/

class SimpleBinarySearch { 
 // Returns index of x if it is present in arr[l..r], else return -1 
 int binarySearch(int arr[], int left, int right, int x) 
 { 
     if (right >= left) { 
         int mid = left + (right - left) / 2; 

         // If the element is present at the middle itself 
         if (arr[mid] == x) 
             return mid; 

         // If element is smaller than mid, then 
         // it can only be present in left subarray 
         if (arr[mid] > x) 
             return binarySearch(arr, left, mid - 1, x); 

         // Else the element can only be present in right subarray 
         return binarySearch(arr, mid + 1, right, x); 
     } 

     // We reach here when element is not present in array 
     return -1; 
 } 

 // Driver method to test above 
 public static void main(String args[]) 
 { 
	 SimpleBinarySearch ob = new SimpleBinarySearch(); 
     int arr[] = { 2, 3, 4, 10, 40 }; 
     int n = arr.length; 
     int searchNumber = 10; 
     int result = ob.binarySearch(arr, 0, n - 1, searchNumber); 
     if (result == -1) 
         System.out.println("Element not present"); 
     else
         System.out.println("Element found at index " + result); 
 } 
} 
