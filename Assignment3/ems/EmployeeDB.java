package com.ems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	
	List <Employee> empDB = new ArrayList<>();
	private ArrayList<Employee> employeeDb;
	
	//-> adds the employee object to the collection 
	public boolean addEmployee (Employee e) {
		return employeeDb.add(e);
	}
	
	// ->delete the employee object from the collection with the given empid
	public boolean deleteEmployee(int empId) {
		  boolean isRemoved=false;
		  
		  Iterator <Employee> itr = empDB.iterator();
		  
		  while(itr.hasNext()) {
		   Employee emp=itr.next();
		   if(emp.getEmpId()==empId) {
		    isRemoved=true;
		    itr.remove();
		   }
		  }
		  return isRemoved;
	}
	
	// returns the payslip of the employee with the given empId
	 public String showPaySlip(int empId) { 
		  for(Employee e : employeeDb) {
		   if(e.getEmpId()==empId) {
		    return "Payslip for employee id "+ empId + " is "+ e.getEmpSalary();
		    }
		  }
		  return "Invalid employee id";
		 }
	
	public Employee[] printAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		  for(int i =0; i < employeeDb.size();i++)
		   empArray[i]=employeeDb.get(i);
		  return empArray;
		   }
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
