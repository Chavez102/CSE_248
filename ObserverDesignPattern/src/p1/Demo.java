package p1;

public class Demo {

	public static void main(String[] args) {
		Student s= new Student("A",2.5);
		StudentObserver o1=new StudentObserver(s);
		StudentObserver o2=new StudentObserver(s);
		s.unregister(o2);
		s.setGpa(2.0);
		
		
		
	}

}
