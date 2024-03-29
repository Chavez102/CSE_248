package p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AllcoursesinCollege {
	
	public static HashMap<String,Course> Allcoursesmap=new HashMap<>();
	
	
	public AllcoursesinCollege() throws IOException{
		
		File file = new File("C:\\Users\\bryan\\Desktop\\CSE_248\\Androidapp_CS_Schedule_BackEnd_Demo\\src\\p1\\AllcoursesinSCC.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  
		  int i=1;
		  String id=null;
		  String name=null;
		  String description=null;
		  int credit=0;
		  String prereq=null;
		  
		  while ((st = br.readLine()) != null) {
			  if(i==1) {
				  id=st;
			  }else if(i==2) {
				  name=st;
				  //name
			  }else if (i==3) {
				  //description
				  
				  description=st;
				  
					prereq="No prereq";
					
					 
					  
					  
					  boolean isFound = st.indexOf("Prerequisite") !=-1? true: false; //true means there are Prerequisite
					  
					  if(isFound) {
						 
						  
						  
						  //ek. (2 hrs. lecture, 2 hrs. laboratory) Prerequisite: CSE218 with a C or higher. Offered on: A / 3 cr. h
						  Scanner scanner = new Scanner(st);
						 String current="hello";
						 
						  while(scanner.hasNext()) {
							  current=scanner.next();
							  if(current.equals("Prerequisite:")) {
								  prereq=scanner.next();
							  }
							  if(current.equals("Prerequisites:")) {
								  prereq=scanner.next();
							  }
						  }
						  
						 
						  scanner.close();
					  }
			  }else if (i==4) {
				  //credit
				  
				  double value = Double.valueOf(st);
				  
				  
				  credit=(int)value;
				  //credit
			  }else if (i==5) {
				  Course newcourse=new Course(id,name,description,credit,prereq);
				  
				  Allcoursesmap.put(id, newcourse);
				  
				  i=0;
			  }
			  i++;
		   
		  } 
		  br.close();
		  printMap();
		
	}
	
	public void printMap() {
		
		  // Getting an iterator 
        Iterator hmIterator = Allcoursesmap.entrySet().iterator(); 
  
   
  
        while (hmIterator.hasNext()) { 
            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
            Course currentcourse = (Course)mapElement.getValue(); 
            
            
            
            System.out.println("id:"+currentcourse.getId()+
            					"                name:"+currentcourse.getName()+
            					"                Prereq:"+currentcourse.getPrereq()+
            					"                Credit:"+currentcourse.getCredit()
            					); 
        } 
		
	}
	

}
