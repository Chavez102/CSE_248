package p1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws IOException{
//		AllcoursesinCollege j=new AllcoursesinCollege();
		
		
		//checking();
		
//		
//		ArrayList<String> list=new ArrayList<>();
//		list.add("f");
//		list.add("e");
//		list.add("df");
//		System.out.println("size:"+list.size());
		
		
		//String id, String name, int credit) 
		ArrayList<Course> arraylsit=new ArrayList<>();
		
		Course c1=new Course("id","name",1);
		
		Course c2=new Course("id","bryan",3);
		arraylsit.add(c1);
		arraylsit.add(c2);
		
		Course c3=new Course("id","bryan",3);
		
		System.out.println(arraylsit.contains(c3));
		
		
	}
	
	public static void  checking() {
		
		
		String prereq="No prereq";
		
		 String st="Computerized enhanced instruction develops accounting principles and procedures as applied to partnerships and corporations. Designed primarily for students anticipating careers in accounting or who otherwise require detailed understanding of financial accounting practices."
		 		+ " Prerequisite: ACC101. Offered on: A-E-G / 4 cr. hrs. ";
		  
		  
		  boolean isFound = st.indexOf("Prerequisite:") !=-1? true: false; //true means there are Prerequisite
		  
		  if(isFound) {
			  
			  
			  //ek. (2 hrs. lecture, 2 hrs. laboratory) Prerequisite: CSE218 with a C or higher. Offered on: A / 3 cr. h
			  Scanner scanner = new Scanner(st);
			 String current="hello";
			 
			  while(!current.equals("Prerequisite:")) {
				  
				 
				  current=scanner.next();
			  }
			  
			  prereq=scanner.next();
			  scanner.close();
		  }
System.out.println(prereq);
		
		
		
		
		
		
		
		
		
		
		
		
		
//	String st="management planning and controlling fiscal activities. Recommended for all students outside accounting emphasis. "
//	 		+ "Prerequisite: ACC101. Offered on: A-E-G / 3 cr. hrs. ";
//	  
//	  boolean isFound = st.indexOf("Prerequisite:") !=-1? true: false; //true means there are Prerequisite
//	  
//	  if(isFound) {
//		  System.out.println("it has prerequisit");
//		  //ek. (2 hrs. lecture, 2 hrs. laboratory) Prerequisite: CSE218 with a C or higher. Offered on: A / 3 cr. h
//		  Scanner scanner = new Scanner(st);
//		 String current="hello";
//		 
//		  while(!current.equals("Prerequisite:")) {
//			  
//			 
//			  current=scanner.next();
//		  }
//		  
//		  System.out.println(scanner.next());
//		  scanner.close();
//	  }
	}

}
