abstract class GeometricShape {
	GeometricShape(){
		System.out.println("About the Geometric Shapes");
	}
    abstract void draw();
    abstract float area(int x);
    abstract float perimeter(int x);
}
class Circle extends GeometricShape {
    void draw() {
    	System.out.println("This is Circle");
    }
    float area(int x) {
    	return (3.14f*x*x);
    }
    float perimeter(int x) {
    	return (2*3.14f*x);
    }
}
class Square extends GeometricShape {
    void draw() {
    	System.out.println("This is Square");
    }
    float area(int x) {
    	return (x*x);
    }
    float perimeter(int x) {
    	return (4*x);
    }
}

public class abstractclass1{  
public static void main(String args[]){ 
GeometricShape g;  
g = new Circle();
g.draw();
System.out.println("The area of circle is " + g.area(5) ); 
System.out.println("The perimeter of circle is " + g.perimeter(5));
g = new Square();
System.out.println("The area of square is " + g.area(5) ); 
System.out.println("The perimeter of square is " + g.perimeter(5));
}  
}  
