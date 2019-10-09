package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.stage.Stage;


public class Student {
	private String[] allFirstNames=new String[2000];
	private String[] allLastNames=new String[2000];
	
	private String firstname=null;
	private String lastname=null;
	private String username=null;
	private String password=null;
	private String id=null;
	private double gpa;
	
//	public static void main(String[] args) throws IOException 
//	{
//		generateRandomFirstName();
//	}
	public Student() {
		try {
			fillArrays("FirstNames");
			fillArrays("LastNames");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//based on textfile name 
		
		this.firstname=generaterandomName("FirstNames");
		this.lastname=generaterandomName("LastNames");
		this.id=generateId();
		this.username=generateUsername();
		this.gpa=generateGPA();
		this.password=generatePassword();
		
	}
	
	
	
	//The first letter of the password has to be capitalized.

private String generatePassword() {
	String password=generateUsername();

	password=password.replace(password.charAt(0), Character.toUpperCase(password.charAt(0)));	
	return password;
}

//gpa: a random value within the range of 0.00 and 4.00.
private double generateGPA() {
	 Double min = 0.0; //  Set To Your Desired Min Value
     Double max = 3.0; //    Set To Your Desired Max Value
     double x = (Math.random() * ((max - min) + 1)) + min; //    This Will Create A Random Number Inbetween Your Min And Max.
     double xrounded = Math.round(x * 100.0) / 100.0; // Creates Answer To The Nearest 100 th, You Can Modify This To Change How It Rounds.
    // System.out.println(xrounded); //    This Will Now Print Out The Rounded, Random N
	
	return xrounded;
}


//id: a unique String of 8 characters long, starting from 00000000, 00000001,00000002, etc.
private String generateId() {
	
	double random = Math.random();
	random = random * 99999999 + 0;
	int randomInt = (int) random;
	
    String padded = String.format("%08d" , randomInt);
    return padded;
}



public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
	//	username: first four letters of the last name and first letter of the first name and
//	last digit of the id number (see below)
	public String generateUsername() {
		String user;
		
		if(this.lastname.length()>=4) {
		username=this.lastname.substring(0, 4); //first four letters of the last name

		}else {
		
		
		 username=this.lastname.substring(0, 2); //first four letters of the last name
		}
		
		username=username+this.firstname.charAt(0);	   //first letter of the first name
		username=username+this.id.charAt(this.id.length()-1);	 //last digit of the id number
		return username;
	}
	
	
	
	
////last name: draw randomly from the “last Names.txt” attached
	private String generaterandomName(String name) {
		double random = Math.random();
		random = random * 1999 + 0;
		int randomInt = (int) random;
	//	System.out.println(randomInt);
		
		if(name.equals("FirstNames")){
			return this.allFirstNames[randomInt];
		}
		else if(name.equals("LastNames")){
			return this.allLastNames[randomInt];
		}
	return null;
	}


	private String fillArrays(String name) throws IOException
	{
		File file = new File("src/textfiles/"+name+".txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String st; 
		int i=0;
		while ((st = br.readLine()) != null) {
			if(name.equals("FirstNames")){
				this.allFirstNames[i]=st;
			}
			else if(name.equals("LastNames")){
				this.allLastNames[i]=st;
			}
			i++;
		  } 
	
		  return st;
	}


		
		
		
}


