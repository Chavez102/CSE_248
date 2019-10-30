package lazy_Initialization;

public class Instructor {
	private static String name;
	private static Instructor instructor;
	
	public Instructor(String name2) {
		name=name2;
	}

	public static Instructor makeInstructor(String name) {
		if(instructor==null) {
			instructor=new Instructor(name);
		}
		return instructor;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Instructor.name = name;
	}
	
	public String toString() {
		return "Instructor name is "+name;
	}
}
	
