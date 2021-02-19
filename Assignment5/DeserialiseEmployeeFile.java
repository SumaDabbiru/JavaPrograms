package Assignment5;

import Assignment5.EmployeeFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserialiseEmployeeFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fip = new FileInputStream("/Users/sumadabbiru/FilesDemo/EmployeeFile.txt");
		ObjectInputStream oi = new ObjectInputStream(fip);
		EmployeeFile ef = (EmployeeFile)oi.readObject();
		System.out.println( "EmployeeName = " + ef.name + " EmployeeDept = " + ef.dept + "  EmployeeRole = " + ef.role + "  EmployeeSalary = " + ef.salary);
		oi.close();
	}


}
