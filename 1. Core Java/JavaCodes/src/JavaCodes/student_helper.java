package JavaCodes;

public class student_helper {

	private int id;
	private String name;

	public int getId() {
		return id;
	}
	
	public student_helper(int id_, String name_) {
		this.id = id_;
		this.name = name_;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printStudent() {
		System.out.println("ID: " + id + " NAME: " + name);
	}
	

}
