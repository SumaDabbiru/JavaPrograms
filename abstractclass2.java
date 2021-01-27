abstract class Animal {
	Animal(){
		System.out.println("Welcome to the animal kingdom");
	}
    abstract void name();
    abstract void say();
    abstract void eat();
}

class Dog extends Animal {
	void name() {
    	System.out.println("I am Dog");
    }
    void say(){
    	System.out.println("I bark");
    }
    void eat(){
    	 System.out.println("I eat meat");
    }
}
class Panda extends Animal {
	void name() {
    	System.out.println("I am Panda");
    }
   	 void say(){
    	System.out.println("I bleat");
    }
    void eat(){
    	 System.out.println("I eat bamboo");
    }
}

class Bear extends Animal {
	void name() {
    	System.out.println("I am Bear");
    }
   	 void say(){
    	System.out.println("I growl");
    }
    void eat(){
    	 System.out.println("I eat  honey");
    }
}

public class abstractclass2{  
public static void main(String args[]){ 
	Animal a;
	a = new Dog();
	a.name();
	a.say();
	a.eat();
	a = new Panda();
	a.name();
	a.say();
	a.eat();
	a = new Bear();
	a.name();
	a.say();
	a.eat(); 
}  
}  
