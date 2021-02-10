package com.ems;
import com.ems.Employee;
import com.ems.EmployeeDB;

public class EmployeeManagement {
 public static void main(String[] args) {
  EmployeeDB empDb = new EmployeeDB();
  
  
  Employee emp1=new Employee(1,"sara","sara@g.com",'f',25000);
  Employee emp2=new Employee(2,"tara","tara@g.com",'f',35000);
  Employee emp3=new Employee(3,"lara","lara@g.com",'m',25000);
  Employee emp4=new Employee(4,"mara","mara@g.com",'f',55000);
  
  System.out.println(emp1);
  System.out.println("Hi");
  
  empDb.addEmployee(emp1);
  empDb.addEmployee(emp2);
  empDb.addEmployee(emp3);
  empDb.addEmployee(emp4);
  
  for(Employee emp : empDb.printAll())
   System.out.println(emp.GetEmployeeDetails());
  System.out.println();
  empDb.deleteEmployee(2);
  
  for(Employee emp : empDb.printAll())
   System.out.println(emp.GetEmployeeDetails());
  
  System.out.println();
  System.out.println(empDb.showPaySlip(3));
  
 }
}
