package Live;
import Music.*;
//import Music.String;



public class Test {
	public static void main(String args[]) {
		Playable pv = null;
		//pv = new Veena();
		Veena v = new Veena();
		pv.play();
		
		Saxophone s = new Saxophone();
		pv = (Playable) new Saxophone();

		v.play();
		s.play();
		
		
	}
}
