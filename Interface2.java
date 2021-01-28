
 class VehicleTypes 
{ 
  interface Vehicle 
  { 
    public int getNoOfWheels(); 
  } 
} 
class Bus implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
      return 6; 
  } 
} 
class Truck implements VehicleTypes.Vehicle 
{ 
  public int getNoOfWheels() 
  { 
    return 8; 
  } 
} 
class Bicycle implements VehicleTypes.Vehicle
{ 
  public int getNoOfWheels()
  { 
     return 2; 
   } 
 } 
public class Interface2 
{ 
  public static void main(String[] args) 
  { 
    Bus b = new Bus(); 
    System.out.println("About Bus"); 
    System.out.println("The bus has " + b.getNoOfWheels() +" wheels"); 

    Truck tr = new Truck(); 
    System.out.println("About Truck");
    System.out.println("The truck has " + tr.getNoOfWheels()+" wheels"); 

    Bicycle bk = new Bicycle(); 
    System.out.println("About Bicycle");
    System.out.println("The bicycle has " + bk.getNoOfWheels()+" wheels"); 
   } 
}