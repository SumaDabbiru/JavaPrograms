
//Creating a parent class.  
class Bank{  
int getRateOfInterest(){
	return 0;
	}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){
	return 8;
	}  
}  

class ICICI extends Bank{  
int getRateOfInterest(){
	return 7;
	}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){
	return 9;
	}  
}  
//Test class to create objects and call the methods  
public class MethodOverriding2{  
public static void main(String args[]){ 
Bank b = new Bank();  
System.out.println("Bank Rate of Interest: "+b.getRateOfInterest());
b = new SBI();
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b = new ICICI();
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b = new AXIS();
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}  