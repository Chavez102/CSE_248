package bill_pugh;

public class Demo {

	public static void main(String[] args) {
		Instructor i1=Instructor.makeTheInstructor();
		i1.setName("Adam");
		System.out.println(i1.getName());
		
		Instructor i2=Instructor.makeTheInstructor();
		i2.setName("bryan");
		System.out.println(i2.getName());
		
		System.out.println(i1==i2);//prove we are talking about the same Instructor

	}

}
