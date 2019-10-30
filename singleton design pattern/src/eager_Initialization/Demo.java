package eager_Initialization;

public class Demo {

	public static void main(String[] args) {
		Instructor l1=Instructor.makeTheInstructor("bill");
		System.out.println(l1.getName());
		Instructor l2=Instructor.makeTheInstructor("Mike");
		System.out.println(l2.getName());
		
		System.out.println("1."+l1.getName());
		System.out.println("2."+l2.getName());
		
		System.out.println(l1==l2);//prove it is the same object cuz same memory address
		

	}

}
