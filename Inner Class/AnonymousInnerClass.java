////Java program to demonstrate need for Anonymous Inner class 
//interface Age 
//{ 
//	int x = 21; 
//	void getAge(); 
//} 
//class AnonymousDemo 
//{ 
//	public static void main(String[] args) 
//	{ 
//		// Myclass is implementation class of Age interface 
//		MyClass obj=new MyClass(); 
//
//		// calling getage() method implemented at Myclass 
//		obj.getAge();	 
//	} 
//} 
//
//// Myclass implement the methods of Age Interface 
//class MyClass implements Age 
//{ 
//	@Override
//	public void getAge() 
//	{ 
//		// printing the age 
//		System.out.print("Age is "+x); 
//	} 
//} 

//Java program to demonstrate Anonymous inner class 
interface Fruit 
{ 
	String x = "Berries"; 
	void getName(); 
} 
class AnonymousInnerClass
{ 
	public static void main(String[] args) { 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Fruit f = new Fruit() { 
			@Override
			public void getName() { 
				// printing age 
				System.out.print("The name of the fruit is "+ x); 
			} 
		}; 
		f.getName(); 
	} 
} 

