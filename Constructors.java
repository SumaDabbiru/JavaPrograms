class Car {
	
   String name;
   int age;
   int count;

   public Car(String name, int age, int count) {
   this.name = name;
   this.age = age;
   this.count = count;

   System.out.println("The car is " + this.name);
   System.out.println("founded in" + this.age);
   System.out.println("Company has produced " + this.count +  " cars");
   System.out.println("On average, it produces " + (this.count/this.age) + " cars per year");
   }
 }

 public class Constructors {
   public static void main(String[] args) {

       Car motors = new Car("GE",10,1000);
       
   }
}