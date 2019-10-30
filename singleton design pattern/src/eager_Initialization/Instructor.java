package eager_Initialization;

public class Instructor {
	private static String name;
	private static Instructor _instructor=new Instructor();
	
	
	//by making private Instructor, I prevent a public Instructor
	private Instructor() {
		
	}
	
	
	public static Instructor makeTheInstructor(String name) {
		Instructor.setsetName(name);
		return _instructor;
	}
	private static void setsetName(String name) {
		Instructor.name=name;
		
	}
	public static String getName() {
		return name;
	}
	
	
	
	
	
}
