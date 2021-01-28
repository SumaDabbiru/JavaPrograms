
//Creating a parent class.  
interface Vehicle{  
	void cost();
	void mileage();
}  
//Creating child classes.  
abstract class Car implements Vehicle{  
	abstract void viper();
}  
abstract class Bike implements Vehicle{  
	abstract void parkingstand();
}   
class Audi extends Car{  
	public void cost() {
		System.out.println("The cost of Audi is 50L");
	}
	public void mileage(){
		System.out.println("The mileage of Audi is 15KMPH");
	}
	public void viper(){
		System.out.println("The car Audi has viper");
	}
}  

class Tesla extends Car{  
	public void cost() {
		System.out.println("The cost of Tesla is 45L");
	}
	public void mileage(){
		System.out.println("The mileage of Tesla is 10KMPH");
	}
	public void viper(){
		System.out.println("The car Tesla has viper");
	}
} 
class KTM extends Bike{  
	public void cost() {
		System.out.println("The cost of KTM is 30L");
	}
	public void mileage(){
		System.out.println("The mileage of KTM is 20KMPH");
	}
	public void parkingstand(){
		System.out.println("KTM has side stand");
	}
} 
class HD extends Bike{  
	public void cost() {
		System.out.println("The cost of HD is 35L");
	}
	public void mileage(){
		System.out.println("The mileage of HD is 18KMPH");
	}
	public void parkingstand(){
		System.out.println("HD has side stand");
	}
} 
//Test class to create objects and call the methods  
public class Interfaceclass1{  
public static void main(String args[]){ 

	Car c;
	Bike b;
	c = new Audi();
	c.cost();
	c.mileage();
	c.viper();
	c = new Tesla();
	c.cost();
	c.mileage();
	c.viper();
	b = new KTM();
	b.cost();
	b.mileage();
	b.parkingstand();
	b = new HD();
	b.cost();
	b.mileage();
	b.parkingstand();
}  
}  