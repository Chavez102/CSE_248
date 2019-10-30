package p2;

import java.util.ArrayList;

public class itemList {
	private ArrayList<ConsumableItem> list;
	
	public itemList() {
		list=new ArrayList<>();
		
	}
	
	public void Add(ConsumableItem item) {
		list.add(item);
		
	}
	
	public void printAllItems() {
		for(int i=0;i<list.size();i++) {
			list.get(i).print();
		}
	}
	
	
	
	
	
	
	
}
