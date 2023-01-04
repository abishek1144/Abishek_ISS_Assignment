package JavaCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collection_list_comparable {
public class StudentNameCompare implements Comparator<Student_helper2>{
		public int compare(Student_helper2 student1, Student_helper2 student2){
	        return student1.getName().compareTo(student2.getName());
	    }
	}
	
	public static void main(String[] args)
    {
        ArrayList<Student_helper2> list = new ArrayList<Student_helper2>();
    
        collection_list_comparable mycomm = new collection_list_comparable();
        list.add(new Student_helper2(33,"Abishek"));   
        list.add(new Student_helper2(03, "Rama"));
        list.add(new Student_helper2(20, "Janani"));
        list.add(new Student_helper2(32, "Daani"));
        list.add(new Student_helper2(93, "TTF"));
        list.add(new Student_helper2(55, "Elix"));
        list.add(new Student_helper2(29, "Julie"));
        
        System.out.println("List before sorting");
        
        System.out.println("\n List after sorting");
 
        StudentNameCompare ratingCompare = mycomm.new StudentNameCompare();

        Collections.sort(list, ratingCompare);
        for (Student_helper2 student: list)
            System.out.println(student.getId() + " " + student.getName());
             
        System.out.println("\n List after sorting by ID");
        Collections.sort(list);
        for (Student_helper2 student: list)
            System.out.println(student.getId() + " " + student.getName());
    }

}
