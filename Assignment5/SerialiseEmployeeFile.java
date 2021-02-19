package Assignment5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Assignment5.EmployeeFile;

public class SerialiseEmployeeFile {
	
	public static void main(String args[]) throws IOException {
		EmployeeFile ef = new EmployeeFile("Henry", "IT", "SoftwareEngineer", 21000);
		FileOutputStream fo = new FileOutputStream("/Users/sumadabbiru/FilesDemo/EmployeeFile.txt");
		ObjectOutputStream ot = new ObjectOutputStream(fo);
		
		ot.writeObject(ef);
		ot.flush();
		ot.close();
	}

}
