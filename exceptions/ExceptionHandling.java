package com.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{    
            int a[]=new int[5];
            String s=null;  
            System.out.println(s.length()); 
            System.out.println(a[10]); 
            a[5]=30/0;  
 
             
           } 
		
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");    

	}

}
