package p2;

public abstract class ConsumableItem {
	private double price;
	public ConsumableItem(double price) {
		this.price=price;
	}
	
	public abstract void print();
	
	public String toString() {
		return String.valueOf(price);
	}
	
}
