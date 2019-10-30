package p1;

public abstract class Decorator implements icomponent{
	private icomponent component;
	
	public void setComponent(icomponent component) {
		this.component=component;
		
	}
	
	public void doJob() {
		if(component!=null) {
			component.doJob();
		}
	}

}
