package p3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapIteratorDemo {
	static HashMap<String,Student> map=new HashMap<>();
	public static void main(String[] args) {
		
		
		Student s1=new Student ("Marlem");
		Student s2=new Student ("Deniz");
		
		map.put(s1.getname(), s1);
		map.put(s2.getname(), s2);
		
		printhashmap();
	}
	
	public static void printhashmap() {
		  // Getting an iterator 
        Iterator hmIterator = map.entrySet().iterator(); 
  
        // Iterate through the hashmap 
        // and add some bonus marks for every student 
        System.out.println("HashMap after adding bonus marks:"); 
  
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            Student marks = ((Student)mapElement.getValue()); 
            System.out.println(marks.getname());
            
        } 
        
	}

}
