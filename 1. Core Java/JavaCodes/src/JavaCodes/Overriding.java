package JavaCodes;

class Vehicle
{  
	void run(){System.out.println("Vehicle is running");}  
}  
	//Creating a child class  
class Overriding extends Vehicle{  
	  public static void main(String args[]){  
		  //creating an instance of child class  
		  Overriding obj = new Overriding();  
		  //calling the method with child class instance  
		  obj.run();  
	  }  
}
