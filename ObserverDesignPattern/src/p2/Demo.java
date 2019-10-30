package p2;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student("AAA",2.5);
		GpaObservers o1=new GpaObservers(s);
		s.setGpa(1.0);
		GpaObservers o2=new GpaObservers(s);
		s.setGpa(4.0);
		
		s.deleteObserver(o2);
		s.setGpa(0.0);

	}

}
