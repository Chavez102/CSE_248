package p1;

public class ConcreteDecorator extends Decorator{
	public void doJob() {
		super.doJob();
		System.out.println("job done by the concreteDecorator class");
	}

}
