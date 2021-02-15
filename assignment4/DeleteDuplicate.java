package com.assignment4;

import java.util.LinkedList;
import java.util.List;

public class DeleteDuplicate {
	public static void main(String args[]) {
        int[] arr = new int[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 }; 
        int n = arr.length; 
          
        if (n==0 || n==1) 
            System.out.println("No duplicates"); 
       
        int[] temp = new int[n]; 
        
        // Start traversing elements 
        int indexJ = 0;
        for (int indexI = 0; indexI < n - 1; indexI++) 
        {
            Integer currentElement = arr[indexI];
             
            if (currentElement != arr[indexI+1]) {
                temp[indexJ++] = currentElement;
            }
        }
         
        
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[indexJ++] = arr[n-1];   
          
   
        // Print updated array 
        for (int i=0; i<temp.length; i++) 
           System.out.print(temp[i]+" "); 
		
		
	}

}
