package lazy_Initialization;

public class Demo {

	public static void main(String[] args) {
		Instructor i1=Instructor.makeInstructor("Bill");
		 System.out.println(i1);
		
		 Instructor i2=Instructor.makeInstructor("Adam");
		 System.out.println(i2);
		 i2.setName("Adam");
		 System.out.println(i1);

	}

}
