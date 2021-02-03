package Assignment2;

import java.util.Scanner;

class Ispalindrome{
	boolean solution(String s) {
		int i = 0;
		int n = s.length();
		int j = n-1;
		//int count=0;
		
		while (i < j) { 
			  
            // If there is no mismatch 
            if (s.charAt(i) != s.charAt(j)) {
            	return false; 
            }
            	 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
		return true; 
	}
}

class Palindrome {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Enter string");
			String str = sc.toString();
			//String str = "liril";
			
			Ispalindrome s = new Ispalindrome();
	        if (s.solution(str)) 
	            System.out.print(str + " is Palindrome"); 
	        else
	        	System.out.print(str + " is not Palindrome"); 
		
}
}