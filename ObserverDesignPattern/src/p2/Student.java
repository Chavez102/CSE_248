package p2;

import java.util.Observable;

//class extends because we imporint it 
public class Student extends Observable{
	public void setName(String name) {
		this.name = name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		setChanged();
		notifyObservers("hello");
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	private String name;
	private double gpa;
	
	public Student(String name,double gpa) {
		this.name=name;
		this.gpa=gpa;
		
	}
}
