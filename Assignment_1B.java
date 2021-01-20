class  Gym{
	int enrollment_no;
	String enrollment_name;
	static String gym_name;
	static String gym_code;
	
}

class Instructor{
	String instructor_name;
	static String profession;
}

public class Assignment_1B {

	public static void main(String[] args) {
		Gym.gym_name = "Planet Fitness";
		Gym.gym_code = "PF";
		
		
		Gym ryan = new Gym();
		ryan.enrollment_name = "Brad Ryan";
		ryan.enrollment_no = 56;

		System.out.println("Gym Enrollment No: " + ryan.enrollment_no);
		System.out.println("Gym Enrollment Name: " + ryan.enrollment_name);
		System.out.println("Gym Name " + Gym.gym_name);
		System.out.println("Gym Code " + Gym.gym_code);
		
		Instructor.profession = "Fitness Trainer";
		
		Instructor ross = new Instructor();
		ross.instructor_name = "Ross Geller";
		System.out.println("Instructor name "+ ross.instructor_name);
		System.out.println("Instructor Profession"+Instructor.profession);
		

	}

}
