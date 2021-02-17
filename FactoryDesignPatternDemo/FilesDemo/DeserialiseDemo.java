package FilesDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiseDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("/Users/sumadabbiru/FilesDemo/Student.txt"));
		Student r = (Student)oi.readObject();
		System.out.println("ID  "+r.StudentId + " MARKS  " + r.marks +" NAME "+r.name);
		
	}

}
