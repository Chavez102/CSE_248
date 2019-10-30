package p1;

public class Wine implements IItem{
	private String produce;
	private String vintage;
	private int abv;
	private double price;
	
	

	



	public Wine(String produce, String vintage, int abv, double d) {
		super();
		this.produce = produce;
		this.vintage = vintage;
		this.abv = abv;
		this.price = d;
	}
	@Override
	public void print() {
		System.out.println(produce +"\t"+vintage+"\t");
		
	}
}
