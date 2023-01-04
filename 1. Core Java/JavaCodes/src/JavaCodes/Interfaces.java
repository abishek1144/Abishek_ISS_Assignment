package JavaCodes;

interface printable{  
	void print();  
}

class Interfaces implements printable{  
	public void print(){
		System.out.println("Hello");
	}  
  
public static void main(String args[]){  
		Interfaces obj = new Interfaces();  
		obj.print();  
 	}  
}
