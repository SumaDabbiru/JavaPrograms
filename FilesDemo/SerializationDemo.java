package FilesDemo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
int StudentId;
float marks;
String name;

//Generated Constructor
public Student(int studentId, float marks, String name) {
	super();
	StudentId = studentId;
	this.marks = marks;
	this.name = name;
}
}

public class SerializationDemo {
	public static void main(String args[]) throws IOException {
		Student r = new Student(1023, 45.23f, "Rain");
		FileOutputStream fo = new FileOutputStream("/Users/sumadabbiru/FilesDemo/Student.txt");
		ObjectOutputStream ot = new ObjectOutputStream(fo);
		ot.writeObject(r);
		ot.flush();
		ot.close();
	}
}