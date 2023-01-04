package JavaCodes;

class Constructors {
	private String name;

	// constructor
	Constructors() {
		System.out.println("Constructor Called:");
	    name = "Abishek Suji Kumar";
	}
	
	public static void main(String[] args) {
		// constructor is invoked while
	    // creating an object of the Main class
		Constructors obj = new Constructors();
	    System.out.println("The name is " + obj.name);
	}
}

