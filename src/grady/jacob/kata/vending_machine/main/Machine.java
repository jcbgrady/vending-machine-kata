package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.*;
import grady.jacob.kata.vending_machine.main.products.*;

public class Machine {
	
	private CoinBank CoinBank = new CoinBank();
	private ProductInventory ProductInventory = new ProductInventory();
	
	private String displayMessage;
	private String displayMessageDefault = "INSERT COIN";

	private Product dispensedProduct = null;

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		try {
			this.CoinBank.processCoinOrReturnIt(coinWeightDiameterThickness);
			this.setDisplayMessage(this.CoinBank.getCurrentAmount().toString());
			return true;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}

	public ArrayList<Coin> checkForReturnedCoins() {
		return this.CoinBank.getReturnedCoins();
	}

	private void setDisplayMessage(String message) {
		this.displayMessage = message;
	}

	public String getDisplayMessage() {
		if(this.displayMessage == null)
			this.setDisplayMessage(this.displayMessageDefault);
		
		String message = this.displayMessage;
		this.setDisplayMessage(null);
		
		return message;
	}

	public boolean selectProdct(String selection) {
		try {
			Product Product = this.ProductInventory.selectProduct(selection);
			this.dispenseProduct(Product);
			this.setDisplayMessage("THANK YOU");
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}

	private void dispenseProduct(Product Product) {
		this.dispensedProduct = Product;
	}

	public Product checkDispenser() {
		return this.dispensedProduct;
	}
}
