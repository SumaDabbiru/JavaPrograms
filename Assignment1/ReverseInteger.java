package Assignment1;
import java.util.Scanner;

class Reverse {
	int solution(int x) {
		int result = 0;
		for(; x != 0; x = x/10){
			
			int digit = x % 10;
			System.out.println(x);
			System.out.println(digit);
		      result = result * 10 + digit;
		        }
	      if (result > 2147483647) {
	          return 0;
	       }
			
		return result;
	}
}

public class ReverseInteger {
	public static void main(String[] args) {
		Reverse r = new Reverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int");
		System.out.println(r.solution(sc.nextInt()));
		
	}

}
