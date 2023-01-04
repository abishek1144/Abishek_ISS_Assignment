package JavaCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class collection_list_primitive_object {
public void listOperations() {

		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
		  
        for (int i = 1; i <= 5; i++)
        	integerArrayList.add(i);
  

        System.out.println("ArrayList is: " + integerArrayList);
        

        integerArrayList.remove(2);
        System.out.println("ArrayList after removing 2nd element in the list: " + integerArrayList);

        System.out.println("Index of element '3' which is: " + integerArrayList.indexOf(3));
        System.out.println("Index of element '4' which is not in the list returns : " + integerArrayList.indexOf(4));
        

        integerArrayList.set(1, 7);
        System.out.println("Setting index '1' value to '7' the ArrayList is: " + integerArrayList);
        

        Object clonedList = integerArrayList.clone();
        System.out.println("cloned copy of ArrayList is: " + clonedList);
        

        integerArrayList.clear();
        System.out.println("cleared arrayList: " + integerArrayList);
        

        System.out.println("Checking if ArrayList is empty: " + integerArrayList.isEmpty());
		
	}
	
	public void setOperations() {
		Set<Integer> setA = new HashSet<Integer>();
        
     
		setA.addAll(Arrays.asList(new Integer[] { 1, 6, 9, 8, 4, 3, 2, 0}));

        Set<Integer> setB = new HashSet<Integer>();
        setB.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5, 10, 11 }));
 
        Set<Integer> union = new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println("Union of the two Set: " + union);
        
        
        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of the two Set: " + intersection);
        
        
        Set<Integer> difference = new HashSet<Integer>(setA);
        difference.removeAll(setB);
        System.out.println("Difference of the two Set: " + difference);
        
        setA.remove(0);
        System.out.println("Set A after removing element 0 is: " + setA);
        

        System.out.println("Checking if element 9 is present in Set A: " + setA.contains(9));
        
		
	}

	public void mapOperations() {
		
		Map<String, Integer> mapA = new TreeMap<>();

        mapA.put("Two", 2);
        mapA.put("Seven", 7);
        mapA.put("Nine", 9);
        System.out.println("Elements in map A are: " + mapA);

        mapA.remove("Two");
        System.out.println("Map A after removing 'two': " + mapA);
        

        System.out.println("Map A size is: " + mapA.size());
        

        System.out.println("Map A element value for key 'Nine': " + mapA.get("Nine"));
        

        System.out.println("Map A has following keys: " + mapA.keySet());
        
        System.out.println("Checking if key 'two' and value '2' is present: " + mapA.containsKey("Two") + " and " + mapA.containsValue(2));
		
	}


	public static void main(String[] args) {
		
		collection_list_primitive_object collectionDemo = new collection_list_primitive_object();
		
		System.out.println("\n The Array List Operations are\n");
		collectionDemo.listOperations();
		
		System.out.println("\n The Set List Operations are\n");
		collectionDemo.setOperations();
		
		System.out.println("\nThe Map List Operations are\n");
		collectionDemo.mapOperations();

	}
}
