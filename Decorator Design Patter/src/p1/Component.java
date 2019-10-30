package p1;
//we use a decorator class to modify this class so we 
//dont change this class
public class Component implements icomponent{
	
	@Override
	public void doJob(){
		System.out.println("Job is Done by the Component class");
	}
	
	
	

}
