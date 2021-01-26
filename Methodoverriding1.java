
// Base Class 
class Employee { 
	public int income = 10000;
	public int bonus = 1000;
	public int ctc = 130000;
	
	int salary() 
	{ 
		return income; 
	} 
	int variablepay() 
	{ 
		return bonus; 
	}
	int ctc() 
	{ 
		return (income*12)+bonus; 
	} 
} 

// Inherited class 
class Manager extends Employee { 
	// This method overrides salary() of Parent 
	int salary() 
	{ 
		return income + 20000; 
	} 
	int variablepay() 
	{ 
		return bonus+500; 
	} 
	int ctc() 
	{ 
		return (income*12)+bonus; 
	} 
} 

// Inherited class 
class Clerk extends Employee { 
	// This method overrides salary() of Parent 
	int salary() 
	{ 
		return income + 10000; 
	} 
	int variablepay() 
	{ 
		return bonus+200; 
	} 
	int ctc() 
	{ 
		return (income*12)+bonus; 
	} 
} 

// Driver class 
public class Methodoverriding1 { 
	// This method can be used to print the salary of 
	// any type of employee using base class reference 
	//static void printSalary(Employee e) 
	//{ 
	//	System.out.println(e.salary()); 
	//} 

	public static void main(String[] args) 
	{ 
		Employee obj1 = new Employee(); 
		System.out.print("Employee minimum salary : " + obj1.salary()); 
		System.out.print("Employee minimum bonus : " + obj1.variablepay()); 
		System.out.print("Employee minimum annual income : " + obj1.ctc());
		
		
		obj1 = new Manager(); 
		
		System.out.print("Manager's salary : " + obj1.salary()); 
		System.out.print("Manager's bonus : " + obj1.variablepay()); 
		System.out.print("Manager's annual income : " + obj1.ctc()); 

		obj1 = new Clerk(); 
		System.out.print("Clerk's salary : " + obj1.salary()); 
		System.out.print("Clerk's bonus : " + obj1.variablepay()); 
		System.out.print("Clerk's annual income : " + obj1.ctc()); 
 
	} 
} 
