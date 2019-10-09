package Basic;

public class Demo {

	public static void main(String[] args) {
		Student model=new Student();
		model.setIdNum("123");
		model.setName("Adam");
		
		
		Student_View view=new Student_View();
		
		studentController controller=new studentController(model,view);
		
		controller.updateView();
		System.out.println("After UPDATE/////////////////////////");
		
		controller.SetStudentIdNum("bill");
		controller.updateView();
		
	

	}

}
