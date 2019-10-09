package Basic;

public class studentController {
	private Student model;
	private Student_View View;
	
	public studentController(Student model,Student_View view) {
		this.model=model;
		this.View=view;
		
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentName()
	{
		return model.getName();
	}
	
	public String SetStudentIdNum(String idNum) {
		return model.getIdNum();
	}
	
	public String getStudentIdNum()
	{
		return model.getIdNum();
	}
	
	
	
//INTERACTING WITH VIEW SIDE
	public void updateView() {
		View.printStudentDetails(getStudentName(), getStudentIdNum());
	}
	
	
	
	
	
	
	

}
