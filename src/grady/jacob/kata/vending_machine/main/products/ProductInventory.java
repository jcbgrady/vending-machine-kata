package grady.jacob.kata.vending_machine.main.products;

import grady.jacob.kata.vending_machine.main.Inventory;

public class ProductInventory extends Inventory {
	
	public ProductInventory() {
		this.inventoryList.put("a1", new Pepsi(5));
		this.inventoryList.put("a2", new Coke(5));
		this.inventoryList.put("a3", new DietCoke(5));
		this.inventoryList.put("a4", new MountainDew(5));
		this.inventoryList.put("a5", new AW(5));

		this.inventoryList.put("b1", new Doritos(5));
		this.inventoryList.put("b2", new CoolRanch(5));
		this.inventoryList.put("b3", new SaltNVinegar(5));
		this.inventoryList.put("b4", new BBQ(5));
		this.inventoryList.put("b5", new Cheetos(5));

		this.inventoryList.put("c1", new Snickers(5));
		this.inventoryList.put("c2", new Rollos(5));
		this.inventoryList.put("c3", new MilkyWay(5));
		this.inventoryList.put("c4", new Skittles(5));
		this.inventoryList.put("c5", new HotTamales(5));
		
	}
}
