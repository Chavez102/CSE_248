package p2;

public class Wine extends ConsumableItem{
	private String producer ;
	private int abv;
	private double price;
	
		public Wine(double price,String producer,int adv) {
			super(price);
			this.abv=abv;
			this.producer=producer;
		}

		@Override
		public void print() {
			System.out.println(abv+"\t"+producer+"\t");
			
		}
		
		

}
