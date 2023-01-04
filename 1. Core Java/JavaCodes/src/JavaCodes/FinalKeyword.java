package JavaCodes;

class FinalKeyword {
	public static void main(String[] args) {
		// create a final variable
		final int NUMBER = 32;

		// try to change the final variable but it doesn't change due to final keyword and throws an error
		//NUMBER = 45;
		
		System.out.println("NUMBER: " + NUMBER);
	}
}
