package p2;

import java.util.Observable;
import java.util.Observer;

//watch GPA
public class GpaObservers implements Observer{

	private static int idTracker;
	private int id;
	private Student student;
	
	public GpaObservers(Student student) {
		this.student=student;
		this.id=++idTracker;
		System.out.println("New observer: "+id);
		this.student.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
	System.out.println(((Student)student).getName()+
			": "+((Student)student).getGpa());
	
		System.out.println("hello");
	}
	

}
