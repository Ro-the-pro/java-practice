package com.rlaul.datastructures.sort;
//https://www.geeksforgeeks.org/bubble-sort/
class BubbleSort 
{ 
	 // An optimized version of Bubble Sort 
    static void bubbleSort(int arr[]) 
    { 
        int i, j, temp; 
        int n = arr.length;
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
    } 
  
    /* Prints the array */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        //BubbleSort ob = new BubbleSort(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        
        BubbleSort.bubbleSort(arr); 
        System.out.println("Bubble Sorted array"); 
        printArray(arr); 
    } 
} 