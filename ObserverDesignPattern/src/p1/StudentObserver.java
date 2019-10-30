package p1;

public class StudentObserver implements Observer{
	private static int idTracker=0;
	private int id;
	
	
	public StudentObserver(Student student) {
		id=++idTracker;
		System.out.println("New Observer registered"+"id :"+id);
		student.register(this);
		
	}

	@Override
	public void update(String name, double gpa) {
		System.out.println(name+":"+gpa);
		
	}
}
