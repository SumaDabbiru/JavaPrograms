import java.util.Scanner;

class Addition {
	//Method Overloading
	void sum(int x, int y) {
		System.out.println("Integer Sum = "+(x+y));
	}
	
	void sum(int x) {
		System.out.println("Entered number = "+x);
	}
}


public class Assignment_3B {

	public static void main(String[] args) {
		Addition a = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		a.sum(sc.nextInt(), sc.nextInt());
		System.out.println("Enter Values");
		a.sum(sc.nextInt());

	}

}
