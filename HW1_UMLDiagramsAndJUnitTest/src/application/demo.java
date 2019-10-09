package application;

public class demo {

	public static void main(String[] args) {
		
		StudentBag bag=new StudentBag();
		for(int i =0;i<10;i++) {
			Student newstudent=new Student();
			bag.insert(newstudent);
		}
		System.out.println("///////////////");
		bag.Display();
		
		
		
		
		

	}

}
