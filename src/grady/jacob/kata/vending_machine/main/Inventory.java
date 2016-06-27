package grady.jacob.kata.vending_machine.main;

import java.util.HashMap;

public class Inventory {
	
	protected HashMap<String, Object> inventoryList = new HashMap<String, Object>();
	
	public boolean addItem(String key, Object item) throws Exception {
		if(this.inventoryList.put(key, item) != null) {
			return true;
		}
		
		throw new Exception("Unable to add item to inventory");
	}
	
	public Object selectProduct(String selection) throws Exception {
		if(this.inventoryList.containsKey(selection))
			return this.inventoryList.get(selection);
		
		throw new Exception("Selection not in inventory");
	}
}
