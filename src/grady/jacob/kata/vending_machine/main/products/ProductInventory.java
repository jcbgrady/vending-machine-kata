package grady.jacob.kata.vending_machine.main.products;

import java.util.HashMap;

public class ProductInventory {
	
	protected HashMap<String, Product> inventoryList = new HashMap<String, Product>();
	
	public ProductInventory() {
		this.inventoryList.put("a1", new Cola(5));
		this.inventoryList.put("a2", new Cola(5));
		this.inventoryList.put("a3", new Cola(5));
		this.inventoryList.put("a4", new Cola(5));
		this.inventoryList.put("a5", new Cola(5));

		this.inventoryList.put("b1", new Chips(5));
		this.inventoryList.put("b2", new Chips(5));
		this.inventoryList.put("b3", new Chips(5));
		this.inventoryList.put("b4", new Chips(5));
		this.inventoryList.put("b5", new Chips(5));

		this.inventoryList.put("c1", new Candy(5));
		this.inventoryList.put("c2", new Candy(5));
		this.inventoryList.put("c3", new Candy(5));
		this.inventoryList.put("c4", new Candy(5));
		this.inventoryList.put("c5", new Candy(5));
	}
	
	public boolean addItem(String key, Product item) throws Exception {
		if(this.inventoryList.put(key, item) != null) {
			return true;
		}
		
		throw new Exception("Unable to add item to inventory");
	}
	
	public Product selectProduct(String selection) throws Exception {
		if(this.inventoryList.containsKey(selection))
			return this.inventoryList.get(selection);
		
		throw new Exception("Selection not in inventory");
	}
}
