package com.rlaul.datastructures.sort;

/* Java program for Merge Sort */
//https://www.geeksforgeeks.org/merge-sort/
class MergeSort 
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[left..mid] 
    // Second subarray is arr[mid+1..right] 
    void merge(int arr[], int left, int mid, int right) 
    { 
    	System.out.println("Inside merge: left:"+left + " mid:"+mid+" right:"+right); 
    	// Find sizes of two subarrays to be merged 
        int leftArrLen = mid - left + 1; 
        int rightArrLen = right - mid; 
  
        /* Create temp arrays */
        int L[] = new int [leftArrLen]; 
        int R[] = new int [rightArrLen]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<leftArrLen; ++i) 
            L[i] = arr[left + i]; 
		
        for (int j=0; j<rightArrLen; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = left; 
        while (i < leftArrLen && j < rightArrLen) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < leftArrLen) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < rightArrLen) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[left..right] using merge() 
    void sort(int arr[], int left, int right) 
    { 
        if (left < right) 
        { 
            // Find the middle point 
            int mid = (left+right)/2; 
            System.out.println("Inside sort left:"+left + " mid:"+mid+" right:"+right); 
            // Sort first and second halves 
            sort(arr, left, mid); 
            sort(arr, mid+1, right); 
  
            // Merge the sorted halves 
            merge(arr, left, mid, right); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7, 20}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 