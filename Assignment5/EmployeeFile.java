package Assignment5;

import java.io.Serializable;

//import java.util.Date;

public class EmployeeFile implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	//private Date DOB;
	String dept;
	String role;
	int salary;


	/**
	 * @param name
	 * @param dOB
	 * @param dept
	 * @param role
	 * @param salary
	 */
	public EmployeeFile(String name, String dept, String role, int salary) {
		super();
		this.name = name;
		//DOB = dOB;
		this.dept = dept;
		this.role = role;
		this.salary = salary;
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



//	/**
//	 * @return the dOB
//	 */
//	public Date getDOB() {
//		return DOB;
//	}
//
//
//
//	/**
//	 * @param dOB the dOB to set
//	 */
//	public void setDOB(Date dOB) {
//		DOB = dOB;
//	}



	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}



	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}



	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}



	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}



	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String GetEmployeeDetails() {
	 return  "EmployeeName = " + name + "Employee Dept = " + dept + "EmployeeRole = " + role + "EmployeeSalary = " + salary;
	}
	
}
