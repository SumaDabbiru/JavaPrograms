package com.assignment4;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = nums.length;
        
        
        // In case k is greater than length of array, then get the modulo of k of length of array which should be same as rotating k number of times
		k = k%nums.length;
        
        // If mod of k of length of array or k = 0, then the array doesn't need to be rotated
        if (k==0) 
        	System.out.print("Array not rotated ");
        
        // Iterate through end of the array starting from the start index
        for (int start=0, count=0; count < nums.length; start++){
            int currIdx=start;
            int currNum=nums[currIdx];

            
            do {
            	System.out.println("Iteration " + count);
                for (int i = 0; i < n; i++)
                    System.out.print(nums[i] + " ");
                
                
                int nextIdx = (currIdx + k) % nums.length;
                int temp = nums[nextIdx];
                
                nums[nextIdx] = currNum;
                currNum = temp;
                
                currIdx = nextIdx;                        
                count++;
            }  while(currIdx != start);
        
        }
        System.out.println("The rotated array is ");
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
	}

}
