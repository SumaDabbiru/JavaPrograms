class Mobile {
	int model_no;
	String model_code;
	static String Company;
	
}

class Network{
	int connection_number;
	static String network_Code;
}

public class Assignment_1A {

	public static void main(String[] args) {
		Mobile.Company = "Samsung";
		Network.network_Code = "VRZ";
		
		
		Mobile note = new Mobile();
		note.model_no = 10;
		note.model_code = "S10";

		System.out.println("Mobile Model No: " + note.model_no);
		System.out.println("Mobile Model Code "+ note.model_code);
		System.out.println("Mobile Company = " + Mobile.Company);

		
		
		
		Network verizon = new Network();
		verizon.connection_number = 719;
		System.out.println("Network Connection Number "+verizon.connection_number);
		System.out.println("Network Code"+Network.network_Code);
		

	}

}
