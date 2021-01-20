class GroceryMart{
	
	void items() {
		System.out.println("1.Milk 2.Curd 3.Eggs 4.Bread");
	}
	
	void itemsPicked(String list) {
		System.out.println("Items picked are " + list);
	}
	
	String itemsBagged() {
		return "Curd";
	}
	String payBill(int amount) {
		System.out.println("Amount paid is " + amount);
		return "paid";
	}
}
public class Assignment_2A {

	public static void main(String[] args) {
	GroceryMart spencer =  new GroceryMart();
	spencer.items();
	spencer.itemsPicked("Curd");
	System.out.println("Items Bought are "+ spencer.itemsBagged());
	System.out.println("Bill "+ spencer.payBill(56));

	}

}
