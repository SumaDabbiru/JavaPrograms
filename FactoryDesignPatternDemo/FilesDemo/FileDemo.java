package FilesDemo;
import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream ft = new FileOutputStream("/Users/sumadabbiru/FilesDemo/test.txt");
		
		//for faster access to files. Stores All characters at a time
		BufferedOutputStream bt = new BufferedOutputStream(ft); 
		String text = "This is the first file input string demo";
		byte[] x = text.getBytes(); // for string input for files
		bt.write(x); // for group of charar
		bt.write(76);
		bt.close();

	}

}
