package JavaCodes;

public class Student_helper2 implements Comparable<Student_helper2>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	// Used to sort student by id
    public int compareTo(Student_helper2 m){
        return this.id - m.id;
    }
    
	public Student_helper2(int id_, String name_) {
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
