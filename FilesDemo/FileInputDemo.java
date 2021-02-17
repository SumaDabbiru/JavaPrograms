package FilesDemo;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("/Users/sumadabbiru/FilesDemo/test.txt");
		BufferedInputStream bi = new BufferedInputStream(fi);
		int x = bi.read();
		
		while (x!= -1) {
			System.out.print((char)x);
			x = bi.read();
		}
		bi.close();
	}

}
