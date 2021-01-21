import java.util.Scanner;

//Base class
class Course
{
	String course_name;
	int course_id;
	int course_duration;
	
	Scanner sc = new Scanner(System.in);
	
	  public void courseInput()
	  {
	      System.out.println("Enter course name: ");
	      course_name = sc.next();
	      System.out.println("Enter course id: ");
	      course_id = sc.nextInt();
	      System.out.println("Enter course duration in hours: ");
	      course_duration = sc.nextInt();
	  }
	  public void courseDetails()
	  {
		  System.out.println("COURSE DETAILS");
	      System.out.println("The course " + course_name + " with ID " + course_id + " is for " + course_duration + " hours");
	  }
}
//child class1
class Joinee extends Course
{
	String student_name;
	int student_id;
	int contact_number;
	  public void studentInput()
	  {
	      System.out.println("Enter student's name: ");
	      student_name = sc.next();
	      System.out.println("Enter student's id: ");
	      student_id = sc.nextInt();
	      System.out.println("Student mobile number: ");
	      contact_number = sc.nextInt();
	  }
	  public void studentDetails()
	  {
	      System.out.println(student_name + " with ID " + student_id + " has registered for " + course_name +  " and the mobile number is " + contact_number);
	  }
}
//child class2
class Instructor extends Course
{
	String instructor_name;
	int instructor_id;
	int available_hours;
	
	  public void instructorInput()
	  {
	      System.out.println("Enter instructor's name: ");
	      instructor_name = sc.next();
	      System.out.println("Enter instructor's id: ");
	      instructor_id = sc.nextInt();
	      System.out.println("Available Hours ");
	      available_hours = sc.nextInt();
	  }
	  public void instructorDetails()
	  {
	      System.out.println(instructor_name + " with ID " + instructor_id + " who teaches " + course_name +  " is available for " + available_hours + " hours");
	  }
}
public class HierarichalInheritance
{
  public static void main(String args[])
  {
	Joinee student = new Joinee();
    Instructor instructor = new Instructor();
    student.courseInput();
    student.courseDetails();
    student.studentInput();
    student.studentDetails();
    instructor.courseDetails();
    instructor.instructorInput();
    instructor.instructorDetails();
  }
}