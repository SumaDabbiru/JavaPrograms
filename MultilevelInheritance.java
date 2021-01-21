import java.util.Scanner;

//base class
class Student
{
	int id;
	String studentname;
	Scanner sc = new Scanner(System.in);
	
	
  public void studentDetailsInput()
  {
    System.out.println("All the Student have same ID throught the education untill placed");
    System.out.println("Enter Student ID");
	id = sc.nextInt();
	System.out.println("Enter Student name");
	studentname = sc.next();
  }
  
  public void studentDetails()
  {
    System.out.println("Student Details");
    System.out.println("Student ID : " + id );
	System.out.println("Student name : " + studentname);
	
  }
  
}

//inherited form base class
class Engineering extends Student
{
	String subject;
  public void branch()
  {
      System.out.println("Enter the Major Subject");
      subject = sc.next();
  }
  public void major()
  {
      System.out.println(studentname+ "'s major is "+subject);
  }
}

// inherited from child class
class Placement extends Engineering
{
  String company_name;
  public void companyDetails()
  {
	  System.out.println("Enter the Companies name");
      company_name = sc.next();
  }
  public void placementDetails()
  {
    System.out.println(studentname+ " got placed in " + company_name);
  }
}

public class MultilevelInheritance {

	public static void main(String[] args) {
	    Placement entree = new Placement();
	    entree.studentDetailsInput();
	    entree.studentDetails();
	    entree.branch();
	    entree.major();
	    entree.companyDetails();
	    entree.placementDetails();
	    
	  }

	}
