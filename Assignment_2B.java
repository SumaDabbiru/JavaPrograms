class Airlines{
	
	void flightsTo() {
		System.out.println("1.Hyderabad 2.Delhi 3.Chennai 4.Mumbai");
	}
	
	void flightChoosen(String airport) {
		System.out.println("Flight choosen to " + airport);
	}
	
	String flightBooked() {
		return "Hyderbad";
	}
	String payBill(int amount) {
		System.out.println("Amount paid is " + amount);
		return "paid";
	}
}
public class Assignment_2B {

	public static void main(String[] args) {
	Airlines airIndia = new Airlines();
	airIndia.flightsTo();
	airIndia.flightChoosen("Hyderabad");
	System.out.println("Flight booked to "+ airIndia.flightBooked());
	System.out.println("Bill "+  airIndia.payBill(5623) );

	}

}
