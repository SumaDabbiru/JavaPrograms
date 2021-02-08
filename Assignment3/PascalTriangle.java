package Assignment3;
import java.io.InputStream;
import java.util.Scanner;

public class PascalTriangle { 
  
//Pascal function  
public static void printPascal(int n) 
{ 
    for(int line = 1; line <= n; line++) 
    { 
          
    int linenumber=1;// used to represent C(line, i)
	    for(int b = 0; b < n-line; b++) // for spaces before the start of the line
	    {
	       System.out.print(" ");
	    }
	    
    	for(int i = 1; i <= line; i++) 
	    {  
	        // The first value in a line is always 1
	    	
	        System.out.print(linenumber+" "); 
	        
	        linenumber = linenumber * (line - i) / i;  
	    } 
    System.out.println(); 
    } 
} 
  
 
public static void main (String[] args) {
	System.out.println("Enter the number to represent the length of pyramid");
	Scanner sc = new Scanner(System.in);
    int n =  sc.nextInt();
    printPascal(n); 
}

} 