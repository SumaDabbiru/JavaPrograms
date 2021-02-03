package Assignment2;
import java.util.Scanner;

class Calculation {
	//Method Overloading
	static void powerInt(int a, int b) {
		System.out.println((int)Math.pow(a, b));
	}
	
	static void powerInt(double a, int b) {
		System.out.println(Math.pow(a, b));
	}
}



public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int and int values");
		Calculation.powerInt(sc.nextInt(), sc.nextInt());
		System.out.println("Enter double and int values");
		Calculation.powerInt(sc.nextDouble(), sc.nextInt());		
		sc.close();
	}

}
