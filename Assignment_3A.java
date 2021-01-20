import java.util.Scanner;

class Add {
	//Method Overloading
	void sum(int x, float y) {
		System.out.println("Sum = "+(x+y));
	}
	
	void sum(float x, int y) {
		System.out.println("Sum = "+(x+y));
	}
}


public class Assignment_3A {

	public static void main(String[] args) {
		Add a = new Add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int and float values");
		a.sum(sc.nextInt(), sc.nextFloat());
		System.out.println("Enter float and int values");
		a.sum(sc.nextFloat(), sc.nextInt());

	}

}
