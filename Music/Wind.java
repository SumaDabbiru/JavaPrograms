package Music;
import Music.*;
import Music.String;

//public abstract class Saxophone implements Playable{  
//	abstract void instrument();
//}  
//

public class Saxophone{
	public void instrument() {
		System.out.println("This is Saxophone is  an instrument");
	}
	public void play() {
		System.out.println("This is Saxophone is in inherited playable method");
	}
} 

public class Wind {
	public static void main(String args[]){ 
		Saxophone sa = new Saxophone();
		sa.play();
		sa.instrument();
		System.out.println("This is Saxophone in Wind Class");

	} 
}