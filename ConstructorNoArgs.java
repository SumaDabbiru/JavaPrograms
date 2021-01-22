class Company {
  String name;
  String product;
  String headquarters;

  // public constructor
  public Company() {
    name = "Sony";
    product = "Mobile";
    headquarters = "Japan";
  }
}

public class ConstructorNoArgs {

  public static void main(String[] args) {

    // object is created in another class
    Company obj = new Company();
    System.out.println("Company name = " + obj.name);
    System.out.println("Products Manufactured = " + obj.product);
    System.out.println("Company's headquarters = " + obj.headquarters);
  }
}