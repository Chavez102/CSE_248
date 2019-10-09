package application;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentBag {
	//Write a StudentBag class: The class will be able to hold up to 2000 students. It should
	//also have the usual insert, deletebyLastName, deleteById, getAverageGpa,
	//findByLastName, and findById methods. Especially make sure all these methods are very
	//efficient. Insert 1000 student objects into the bag.
	
	public HashMap<String,Student> studenthashmap=new HashMap<>(2000);
	
	public void insert(Student newstudent) {
		studenthashmap.put(newstudent.getUsername(), newstudent);
	}
	
	public void deletebyLastName(String lastname) {
        Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
        	 if(mapElement.getValue().getLastname().equals(lastname)){
        		 studenthashmap.remove(mapElement.getKey());
        		 break;
        	 }
        		 
        }
            
	} 
	
	
	public void deleteById(String newID){
		Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
        	 if(mapElement.getValue().getId().equals(newID)){
        		 studenthashmap.remove(mapElement.getKey());
        		 break;
        	 }
        		 
        }
		
	}
	
	public double getAverageGpa() {
		double average;
		double sum=0;
		
		
		Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
	        	sum=sum+mapElement.getValue().getGpa(); 
        }
        
        average=sum/studenthashmap.size();
        return average;
        
		
	}
	
	
	
	public Student findByLastName(String lastname) {
		System.out.println("here");
        Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
        	 if(mapElement.getValue().getLastname().equals(lastname)){
        		 
        		 return studenthashmap.get(mapElement.getKey());
    
        	 }
        		 
        }
        System.out.println("er");
        return null;
            
	}
	
	

	public Student findById(String Id){
		Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
        	 if(mapElement.getValue().getId().equals(Id)){
        		 return studenthashmap.get(mapElement.getValue());
        	 }
        		 
        }
        return null;
		
	}

	
	public void Display()
	{
		Iterator<Entry<String, Student>> Iterator = studenthashmap.entrySet().iterator(); 
        while (Iterator.hasNext()) { 
        	 Map.Entry<String, Student> mapElement = (Map.Entry<String, Student>)Iterator.next();
        	
        	System.out.println(mapElement.getValue().getFirstname()+":"+
        						mapElement.getValue().getLastname()+":"
        					   +mapElement.getValue().getUsername()+":"+
        					   mapElement.getValue().getPassword()+":"+
        					   mapElement.getValue().getId()
        					   );
        }
       
		
	}
}
