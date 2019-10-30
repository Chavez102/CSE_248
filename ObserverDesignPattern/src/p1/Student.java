package p1;

import java.util.ArrayList;

//is going to be a subject
public class Student implements Observable{
	private ArrayList<Observer> observerList;
	private String name;
	private double gpa;
	
	public Student(String name,double gpa) {
		observerList=new ArrayList<>();
		this.name=name;
		this.gpa=gpa;
		
	}

	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
		notifyObservers();
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int index=observerList.indexOf(o);
		observerList.remove(index);
		System.out.println("observer"+(index+1)+"was removed");
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observerList) {
			o.update(this.name, this.gpa);
		}
		
	}
	
	

}
