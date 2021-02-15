package com.assignment4;

import java.util.Scanner;

/*
Subtract divisor with dividend and increase the quetions each time
stop substraction if divisor < 0
the the number grater than 0 and less than dividend  is remainder
*/

public class DivisionInt {
	public static void main (String[] args) {
		
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter divisor: ");
		int divisor = sc.nextInt();
		sc.close();
		
		//ternary operator variable x = (expression) ? value if true: value if false
		int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1; 
		
		dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
		
		while (divisor <= dividend )
		{
			dividend = dividend - divisor;
			counter = counter+1;
		}
		
		System.out.println("Quotient is: "+ sign*counter);
		System.out.println("Remainder is: "+ dividend);
	}
}
