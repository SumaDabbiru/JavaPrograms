package Music;
import Music.*;
import Music.String;

//public class Veena implements Playable{  
//	void string() {
//	}
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

public class Veena{
	public void string() {
		System.out.println("This is Veena has 6 strings");
	}
	public void play() {
		System.out.println("This is Veena is in inherited play method");
	}
} 

public class String {
	public static void main(String args[]){ 
		Veena ev =  new Veena();
		ev.play();
		ev.string();
		System.out.println("This is Veena in String Class");

	} 
}

