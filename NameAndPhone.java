package WebFrequency;

public class NameAndPhone {
	public static void main(String[] args) {

		String name = args.length > 0 ? args[0] : "anonymous";
		String phone = args.length > 1 ? args[1] : "not listed";
		System.out.println("Name: " + name + " Phone: " + phone);
		
		if (args.length > 0)
			name = args[0];
		else
			name = "anonymous";
		
		if (args.length > 1)
			phone = args[1];
		else
			phone = "not listed";
		System.out.println("Name: " + name + " Phone: " + phone);
	}
}
